grammar ExprezeeneParser;

TO_SKIP     : ([\r\t\n] | ' ') -> skip
            ;


//keywords

DEFINE      : 'define';
ALIAS       : 'alias';
NAMESPACE   : 'namespace';
IMPORT      : 'import';
CLASS       : 'class';
AS          : 'as';
THIS        : 'this';
NEW         : 'new';
INHERIT     : 'inherit';

PUBLIC      : 'public';
PRIVATE     : 'private';
PROTECTED   : 'protected';
STATIC      : 'static';
CONSTANT    : 'const';

INT         : 'int';
FLOAT       : 'float';
DOUBLE      : 'double';
LONG        : 'long';
BOOLEAN     : 'bool';
CHAR        : 'char';

IF          : 'if';
ELSE        : 'else';

WHILE       : 'while';
FOR         : 'for';
DO          : 'do';
IN          : 'in';

GO          : 'go';

//token
IDENTIFIER
    : [A-Za-z] [A-Za-z0-9_]*
    ;

// literal
DECIMAL_LITERAL     : DecDigit ([0-9_]* DecDigit)?
                    ;

FLOAT_LITERAL       : (DecDigit+ '.' DecDigit* | '.' DecDigit+) ([Ee] '+'? DecDigit+)? [FfDd]?
                    | DecDigit+ (([Ee] '+'?) DecDigit)? [FfDd]
                    ;

HEX_LITERAL         : '0' [xX] HexDigit ([0-9a-fA-F_]* HexDigit)? [lL]?
                    ;

OCTAL_LITERAL       : '0' '_'* DecDigit ([0-7_]* DecDigit)? [lL]?
                    ;

BINARY_LITERAL      : '0' [bB] [01] ([01_]* [01])? [lL]?
                    ;

CHAR_LITERAL        : '\'' (~['\\\r\n] | EscapeSequence) '\''
                    ;

STRING_LITERAL      : '"' (~["\\\r\n] | EscapeSequence)* '"'
                    ;

BOOLEAN_LITERAL     : 'true' | 'false'
                    ;

NULL_LITERAL        : 'null'
                    ;

fragment EscapeSequence
    : '\\' [btnfr"'\\]
    | '\\' ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9A-Fa-f]
    ;

fragment DecDigit
    : [0-9]
    ;

fragment OctDigit
    : [0-7]
    ;

// parser rule

integerLiteral
    : DECIMAL_LITERAL
    | OCTAL_LITERAL
    | BINARY_LITERAL
    | HEX_LITERAL
    ;

floatLiteral
    : FLOAT_LITERAL
    ;

literal
    : integerLiteral
    | floatLiteral
    | STRING_LITERAL
    | CHAR_LITERAL
    | BOOLEAN_LITERAL
    | NULL_LITERAL
    ;

methodCall
    : IDENTIFIER '(' (expr (',' expr)*)* ')'
    ;

memberVarAccess
    : '.' IDENTIFIER
    ;

memberMethodAccess
    : '.' methodCall
    ;

idExpr
    : THIS // point to current object
    | IDENTIFIER // variables
    ;

expr
	:   literal
	|   idExpr
    |   methodCall //function call
    |   memberVarAccess //var member access
    |   memberMethodAccess //method member access
    |   expr '.' (IDENTIFIER|methodCall)
    |	'(' expr ')'  //grouping with parentheses
    |	('+' | '-') expr	//unary plus/minus
    |	expr ('/' | '*'| '%') expr	//explicit division/multiplication
    |	expr ('+' | '-') expr	//addition/subtraction
    ;

parameter
    : '(' (expr( ',' expr)*)* ')'
    ;

arguments
    : '('
    ;


accmod
    : PUBLIC|PRIVATE|PROTECTED
    ;

modifier
    : accmod? STATIC? CONSTANT?
    ;

type
    : primitiveType
    | referenceType
    ;

primitiveType
    : INT
    | FLOAT
    | BOOLEAN
    | DOUBLE
    | LONG
    | CHAR
    ;

referenceType
    : userDefinedType
    ;

userDefinedType
    : IDENTIFIER
    ;

program
    : globalScopeStatement+
//    | entryPoint globalScopeStatement
//    | globalScopeStatement entryPoint
//    | entryPoint
    ;

globalScopeStatement
    : importStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | classDefStatement
    | methodDefStatement
    ;

entryPoint
    : accmod? STATIC 'go' '(' ')'  (AS VOID)? '{' allowedEntryPointStatement '}'
    ;

allowedEntryPointStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | methodCall ';'
    | condStatement
    | loopStatement
    | objInstStatement ';'
    | '{' allowedEntryPointStatement '}'
    ;

lineStatement
    : importStatement
    | varDeclStatement
    | varInitStatement
    | varAssignStatement
    | objInstStatement
    | methodCall
    ;

importStatement
    : IMPORT IDENTIFIER (AS IDENTIFIER)? ( ',' IDENTIFIER (AS IDENTIFIER)?)*
    ;

varDeclStatement
    : modifier IDENTIFIER (',' IDENTIFIER)* AS type
    ;

varInitStatement
    : modifier IDENTIFIER '=' (expr|objInstStatement) (',' IDENTIFIER '=' (expr|objInstStatement))*
    ;

varAssignStatement
    : IDENTIFIER '=' (expr|objInstStatement)
    ;

objInstStatement
    : NEW IDENTIFIER '(' (expr (',' expr)*)* ')'
    ;

blockStatement
    : classDefStatement
    | methodDefStatement
    | condStatement
    | loopStatement
    ;

classDefStatement
    : modifier CLASS IDENTIFIER  (INHERIT IDENTIFIER)? '{' inClassStatement* '}'
    ;

inClassStatement
    : classDefStatement
    | methodDefStatement
    | varDeclStatement ';'
    | varInitStatement ';'
    ;

inMethodStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | objInstStatement ';'
    | methodCall ';'
    | condStatement
    | loopStatement
    | '{' inMethodStatement '}'
    ;

methodDefStatement
    : modifier IDENTIFIER '(' (IDENTIFIER AS type ( ',' IDENTIFIER AS type)*)* ')' AS IDENTIFIER '{' inMethodStatement* '}'
    ;

condStatement
    : ifStatement
    | elseIfStatement
    | elseStatement
    ;

ifStatement
    : IF '(' expr ')' '{' inIfStatement* '}'
    ;

elseIfStatement
    : ELSE IF '(' expr ')' '{' inIfStatement* '}'
    ;

elseStatement
    : ELSE '{' inIfStatement* '}'
    ;

inIfStatement
    : methodCall ';'
    ;

loopStatement
    : whileLoop
    | forLoop
    | foreachLoop
    | doWhileLoop
    ;


whileLoop
    : WHILE '(' expr ')' '{' inLoopStatement* '}'
    ;

forLoop
    : FOR '(' IDENTIFIER '=' expr ';' expr ';' expr ')' '{' inLoopStatement* '}'
    ;

foreachLoop
    : FOR '(' IDENTIFIER AS IDENTIFIER IN IDENTIFIER ')' '{' inLoopStatement* '}'
    ;

doWhileLoop
    : DO '{' inLoopStatement* '}' 'while' '(' expr ')' ';'
    ;

inLoopStatement
    : methodCall ';'
    | varAssignStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | condStatement ';'
    | loopStatement ';'
    ;


