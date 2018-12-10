grammar ExprezeeneParser;



//keywords

DEFINE      : 'define';
ALIAS       : 'alias';
NAMESPACE   : 'namespace';
IMPORT      : 'import';
CLASS       : 'class';
AS          : 'as';
THIS        : 'this';

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

IF          : 'if';
ELSE        : 'else';

WHILE       : 'while';
FOR         : 'for';
DO          : 'do';
IN          : 'in';

GO          : 'go';

//token
IDENTIFIER
    : [A-Za-z] [\w]+
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

// parser rule

accmod
    : PUBLIC|PRIVATE|PROTECTED
    ;

modifier
    : accmod? STATIC? CONSTANT?
    ;

program
    : globalScopeStatement
    | entryPoint globalScopeStatement
    | globalScopeStatement entryPoint
    | entryPoint
    ;

globalScopeStatement
    : importStatement
    | varDeclStatement
    | varInitStatement
    | classDefStatement
    | methodDefStatement
    ;

entryPoint
    : STATIC 'go' '(' ')'  AS VOID
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
    : 'import' IDENTIFIER (AS IDENTIFIER)? ( ',' IDENTIFIER (AS IDENTIFIER)?)*
    ;

varDeclStatement
    : modifier IDENTIFIER (',' IDENTIFIER)* AS IDENTIFIER
    ;

varInitStatement
    : modifier IDENTIFIER '=' (expr|objInstStatement) (',' IDENTIFIER '=' (expr|objInstStatement))*
    ;

varAssignStatement
    : IDENTIFIER '=' (expr|objInstStatement)
    ;

objInstStatement
    : 'new' IDENTIFIER '(' (expr (',' expr)*)* ')'
    ;

blockStatement
    : classDefStatement
    | methodDefStatement
    | condStatement
    | loopStatement
    | anonScopeStatement
    ;

classDefStatement
    : 'class' IDENTIFIER  ('inherit' IDENTIFIER)? '{' inClassStatement+ '}'
    ;

inClassStatement
    : classDefStatement
    | methodDefStatement
    | varDeclStatement
    | varInitStatement
    ;

inMethodStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | objInstStatement ';'
    | methodCall ';'
    | condStatement
    | loopStatement
    ;

methodDefStatement
    : modifier IDENTIFIER '(' inMethodStatement* ')' AS IDENTIFIER '{' inMethodStatement* '}'
    ;

condStatement
    : ifStatement
    | elseIfStatement
    | elseStatement
    ;

ifStatement
    : 'if' '(' expr ')' '{' inIfStatement* '}'
    ;

inIfStatement
    : methodCall ';'
    ;

elseIfStatement
    : 'else' 'if' '(' expr ')' '{' inIfStatement* '}'
    ;

elseStatement
    : 'else' '{' inIfStatement* '}'
    ;

loopStatement
    : whileLoop
    | forLoop
    | foreachLoop
    | dowhileLoop
    ;


whileLoop
    : 'while' '(' expr ')' '{' inLoopStatement* '}'
    ;

inLoopStatement
    : methodCall ';'
    | varAssignStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | condStatement ';'
    | loopStatement ';'
    ;

forLoop
    : 'for' '(' IDENTIFIER '=' expr ';' expr ';' expr ')' '{' inLoopStatement* '}'
    ;
