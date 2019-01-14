grammar test123;

SKIPP : (' '| [\r\t\n]) -> skip;

hello_world
    : 'hello' ALFANUMERIK+
    ;


ALFANUMERIK
    : [A-Za-z][A-Za-z0-9_]*;