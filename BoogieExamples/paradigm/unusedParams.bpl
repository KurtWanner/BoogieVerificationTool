
var a:int;
var b:int;
var c:int;

procedure foo (x:int)
modifies c;
ensures c == a + b;
{
  c := a + b;
}

