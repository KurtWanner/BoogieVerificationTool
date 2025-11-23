
var y:int;
var z:int;

procedure foo (x:int)
requires z > 3;
modifies y;
ensures y == x - 3;
{
 y := x - 3;
}

