grammar g;
prule: s;
s: c | s ' U ' c ;
c: r | '('s')' | '('s')'o;
r: n | 'E';
o: X | X n;
n: d | n d;
d: A | A X;
A: 'a'..'z'|'0'..'9';
X: '*' | '+' | '?';
/*
Expr: Parenthesis ExprRecur;
ExprRecur: (' U ' Parenthesis ExprRecur)?;
Parenthesis: Value | '('Expr')' | '('Expr')' Outer;
Value: CharArray | 'E';
Outer: Symbol | Symbol CharArray;
CharArray: Char CharRecur;
CharRecur: (Char CharRecur);
Symbol: '*' | '+' | '?';
Char:'a'..'z'|'0'..'9';
*/

//S: C T;
//T:(' U ' C T)?;
//C: R | '('S')' | '('S')'O;
//R: N | 'E';
//O: X | X N;
//N: D L;
//L: (D N)?;
//D: A | A X;
//A: 'a'..'z'|'0'..'9';
//X: '*' | '+' | '?';

//S: S 'U' C| C;
//C: R | (S) | (S)O;
//R: N | 'E';
//O: X | N;
//N: N D | D;
//D: A | A X;
//A: 'a'..'z' | '0'..'9';
//X: '*' | '+' |'?';

//prule: 'hello ' CHAR+;
//CHAR: 'a'..'z' | ' ' |'0'..'9';