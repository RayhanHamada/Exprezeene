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
FROM        : 'from';
PREPROCESSOR: 'preprocessor';

PUBLIC      : 'public';
PRIVATE     : 'private';
PROTECTED   : 'protected';
STATIC      : 'static';
CONSTANT    : 'const';
VAR         : 'var';

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

identifier
    : IDENTIFIER
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
    : identifier arguments
    ;

expr
    : primary                                       #primaryExpr
    | expr operator='.' (identifier|methodCall)     #memberAccessExpr
    | expr '[' expr ']'                             #arrayAccessExpr
    | methodCall                                    #methodCallExpr
    | objInstStatement                              #objInstExpr
    | expr postfix=('++' | '--')                    #postFixExpr
    | prefix=('+'|'-'|'++'|'--') expr               #preFixExpr
    | prefix=('~'|'!') expr                         #preFixExpr
    | expr operator=('*'|'/'|'%') expr              #multExpr
    | expr operator=('+'|'-') expr                  #addExpr
    | expr ('<' '<' | '>' '>' '>' | '>' '>') expr   #bitShiftExpr
    | expr operator=('<=' | '>=' | '>' | '<') expr  #relationalExpr
    | expr operator=('==' | '!=') expr              #relationalExpr
    | expr operator='&' expr                        #andBitWiseExpr
    | expr operator='^' expr                        #xorBitWiseExpr
    | expr operator='|' expr                        #orBitWiseExpr
    | expr operator='&&' expr                       #andLogicExpr
    | expr operator='||' expr                       #orLogicExpr
    | <assoc=right> expr operator=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expr #assignmentExpr
    ;

primary
    : literal
    | identifier
    | '(' expr ')'
    ;

parameter
    : '(' (parameterVar( ',' parameterVar)*)*  ')'
    ;

parameterVar
    : identifier AS dataType defaultValueParameter?
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
    : accmod? STATIC?
    ;

dataType
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
    : userDefinedType ('.' userDefinedType)*
    ;

userDefinedType
    : identifier
    ;

program
    : preprocessorStatement* globalScopeStatement* EOF
    ;

globalScopeStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | classDefStatement
    | methodDefStatement
    ;

preprocessorStatement
    : PREPROCESSOR '{' inPreprocessorStatement* '}'
    ;

inPreprocessorStatement
    : importStatement ';'
    ;

nameSpaceDefinition
    : NAMESPACE '{' nameSpaceStatement* '}'
    ;

nameSpaceStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | classDefStatement
    | methodDefStatement
    | nameSpaceDefinition
    ;

importStatement
    : IMPORT (scriptPath) (',' (scriptPath))*
    ;

scriptPath
    : STRING_LITERAL
    ;



varDeclStatement
    : modifier VAR varIdentifier (',' varIdentifier)* AS dataType
    ;

varInitStatement
    : modifier varConst varIdentifier AS dataType '=' (expr|objInstStatement)
    ;

varAssignStatement
    : <assoc=right> expr operator=('=' | '+=' | '-=' | '*=' | '/=' | '&=' | '|=' | '^=' | '>>=' | '>>>=' | '<<=' | '%=') expr
    ;

varIdentifier
    : identifier
    ;

varConst
    : VAR
    | CONSTANT
    ;

objInstStatement
    : NEW identifier arguments
    ;

classDefStatement
    : modifier CLASS classIdentifier  (INHERIT dataType)? '{' inClassStatement* '}'
    ;

classIdentifier
    : identifier
    ;

inClassStatement
    : classDefStatement
    | methodDefStatement
    | varDeclStatement ';'
    | varInitStatement ';'
    ;

methodDefStatement
    : modifier FUNCTION funcIdentifier parameter (AS dataType)? '{' inMethodStatement* '}'
    ;

funcIdentifier
    : identifier
    ;

inMethodStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | objInstStatement ';'
    | methodCall ';'
    | condStatement
    | loopStatement
    | expr ';'
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
    | varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | loopStatement
    | condStatement
    | expr ';'
    | '{' inIfStatement* '}'
    ;

loopStatement
    : whileloop
    | forloop
    | foreachloop
    | doWhileloop
    ;

whileloop
    : WHILE '(' expr ')' '{' inloopStatement* '}'
    ;

forloop
    : FOR '(' varInitStatement ';' expr ';' expr ')' '{' inloopStatement* '}'
    ;


foreachloop
    : FOR '(' identifier AS dataType IN identifier ')' '{' inloopStatement* '}'
    ;

doWhileloop
    : DO '{' inloopStatement* '}' WHILE '(' expr ')' ';'
    ;

inloopStatement
    : methodCall ';'
    | varAssignStatement ';'
    | varDeclStatement ';'
    | varInitStatement ';'
    | condStatement
    | loopStatement
    | expr ';'
    | '{' inloopStatement* '}'
    ;


