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
    : primary                                       #primaryExpr
    | expr operator='.' (IDENTIFIER|methodCall)     #memberAccessExpr
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
    | IDENTIFIER
    | '(' expr ')'
    ;

parameter
    : '(' (parameterVar( ',' parameterVar)*)*  ')'
    ;

parameterVar
    : IDENTIFIER AS dataType defaultValueParameter?
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
    : accmod? 'go' parameter  (AS )? '{' allowedEntryPointStatement* '}'
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

importStatement
    : IMPORT scriptName (AS scriptNameAlias)? ( ',' scriptName (AS scriptNameAlias)?)*
    ;

scriptName
    : IDENTIFIER
    ;

scriptNameAlias
    : IDENTIFIER
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
    : IDENTIFIER
    ;

varConst
    : VAR
    | CONSTANT
    ;

objInstStatement
    : NEW IDENTIFIER arguments
    ;

classDefStatement
    : modifier CLASS IDENTIFIER  (INHERIT dataType)? '{' inClassStatement* '}'
    ;

inClassStatement
    : classDefStatement
    | methodDefStatement
    | varDeclStatement ';'
    | varInitStatement ';'
    ;

methodDefStatement
    : modifier FUNCTION IDENTIFIER parameter (AS dataType)? '{' inMethodStatement* '}'
    ;

inMethodStatement
    : varDeclStatement ';'
    | varInitStatement ';'
    | varAssignStatement ';'
    | objInstStatement ';'
    | methodCall ';'
    | condStatement
    | loopStatement
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
    | loopStatement
    | condStatement
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
    : FOR '(' IDENTIFIER '=' expr ';' expr ';' expr ')' '{' inloopStatement* '}'
    ;

foreachloop
    : FOR '(' IDENTIFIER AS IDENTIFIER IN IDENTIFIER ')' '{' inloopStatement* '}'
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
    | '{' inloopStatement* '}'
    ;


