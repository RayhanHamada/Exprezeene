grammar Exprezeene;

TO_SKIP     : ([\r\t\n] | ' ') -> skip
            ;

//keywords
DEFINE      : 'define';
ALIAS       : 'alias';
NAMESPACE   : 'namespace';
IMPORT      : 'import';
CLASS       : 'class';
FUNCTION    : 'func';
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
    : IDENTIFIER arguments
    ;

expr
    : primary
    | expr operator='.' (IDENTIFIER|methodCall)
    | expr '[' expr ']'
    | methodCall
    | objInstStatement
    | expr postfix=('++' | '--')
    | prefix=('+'|'-'|'++'|'--') expr
    | prefix=('~'|'!') expr
    | expr operator=('*'|'/'|'%') expr
    | expr operator=('+'|'-') expr
    | expr ('<' '<' | '>' '>' '>' | '>' '>') expr
    | expr operator=('<=' | '>=' | '>' | '<') expr
    | expr operator=('==' | '!=') expr
    | expr operator='&' expr
    | expr operator='^' expr
    | expr operator='|' expr
    | expr operator='&&' expr
    | expr operator='||' expr
    | <assoc=right> expr operator=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expr
    ;

primary
    : literal
    | IDENTIFIER
    | '(' expr ')'
    ;

parameter
    : '(' (IDENTIFIER AS type defaultValueParameter?( ',' IDENTIFIER AS type defaultValueParameter?)*)*  ')'
    ;

defaultValueParameter
    : '=' expr
    ;

arguments
    : '(' (expr (',' expr)*)* ')'
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
    : globalScopeStatement* entryPoint
    ;

globalScopeStatement
    : importStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | classDefStatement
    | methodDefStatement
    ;

entryPoint
    : accmod? STATIC 'go' parameter  (AS )? '{' allowedEntryPointStatement '}'
    ;

allowedEntryPointStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | methodCall ';'
    | condStatement
    | looperatorStatement
    | objInstStatement ';'
    | '{' allowedEntryPointStatement '}'
    ;

importStatement
    : IMPORT IDENTIFIER (AS type)? ( ',' IDENTIFIER (AS type)?)*
    ;

varDeclStatement
    : modifier 'var' IDENTIFIER (',' IDENTIFIER)* AS type
    ;

varInitStatement
    : modifier 'var' IDENTIFIER '=' (expr|objInstStatement) (',' IDENTIFIER '=' (expr|objInstStatement))*
    ;

varAssignStatement
    : <assoc=right> expr operator=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expr
    ;

objInstStatement
    : NEW IDENTIFIER parameter
    ;

classDefStatement
    : modifier CLASS IDENTIFIER  (INHERIT type)? '{' inClassStatement* '}'
    ;

inClassStatement
    : classDefStatement
    | methodDefStatement
    | varDeclStatement ';'
    | varInitStatement ';'
    ;

methodDefStatement
    : modifier FUNCTION IDENTIFIER parameter (AS type)? '{' inMethodStatement* '}'
    ;

inMethodStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | objInstStatement ';'
    | methodCall ';'
    | condStatement
    | looperatorStatement
    | '{' inMethodStatement '}'
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
    | varDeclStatement
    | varInitStatement
    | varAssignStatement
    | looperatorStatement
    | condStatement
    | '{' inIfStatement* '}'
    ;

looperatorStatement
    : whileLooperator
    | forLooperator
    | foreachLooperator
    | doWhileLooperator
    ;

whileLooperator
    : WHILE '(' expr ')' '{' inLooperatorStatement* '}'
    ;

forLooperator
    : FOR '(' IDENTIFIER '=' expr ';' expr ';' expr ')' '{' inLooperatorStatement* '}'
    ;

foreachLooperator
    : FOR '(' IDENTIFIER AS IDENTIFIER IN IDENTIFIER ')' '{' inLooperatorStatement* '}'
    ;

doWhileLooperator
    : DO '{' inLooperatorStatement* '}' WHILE '(' expr ')' ';'
    ;

inLooperatorStatement
    : methodCall ';'
    | varAssignStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | condStatement
    | looperatorStatement
    | '{' inLooperatorStatement* '}'
    ;


