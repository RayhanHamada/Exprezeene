grammar tester;

TO_SKIP
    : ([\t\r\n] | ' ') -> skip
    ;
IDENTIFIER
    : [A-Za-z_] [A-Za-z0-9_]*
    ;

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
    : IDENTIFIER '(' ')'
    ;


expr
	:   literal
	|   methodCall //function call
	|	IDENTIFIER  //variables
	|   '.' IDENTIFIER //var member access
	|   '.' methodCall //method member access
	|	'(' expr ')'  //grouping with parentheses
	|	('+' | '-') expr	//unary plus/minus
	|	expr ('/' | '*'| '%') expr	//explicit division/multiplication
	|	expr ('+' | '-') expr	//addition/subtraction
	;

stat
    : expr+
    ;
