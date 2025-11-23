
var a:int;
var b:int;
var c:int;

procedure foo (x:int)
modifies c;
requires x > 5 && x < 5;
ensures c == a + b;
{
  c := a + b + 1;
}

