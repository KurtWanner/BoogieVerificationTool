grammar Boogie;

PROCEDURE   :   'procedure';
FREE        :   'free';
REQUIRES    :   'requires';
MODIFIES    :   'modifies';
ENSURES     :   'ENSURES';

spec
    :   FREE? MODIFIES ID ';'
    |   FREE? REQUIRES ';'
    |   FREE? ENSURES ';'
    ;

ID  : Letter LetterOrDigit* ;



WS  : [ \t\r\n\u000C]+ -> channel(HIDDEN);
COMMENT      : '/*' .*? '*/'    -> channel(HIDDEN);
LINE_COMMENT : '//' ~[\r\n]*    -> channel(HIDDEN);

fragment LetterOrDigit: Letter | [0-9];

fragment Letter : [a-zA-Z$_] ;
