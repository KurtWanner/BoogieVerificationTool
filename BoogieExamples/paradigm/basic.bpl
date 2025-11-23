// VALID : 
// 
var y:int;

procedure foo (x:int)
requires x >= 3;
modifies y;
ensures (y == x - 3 && y >= 0);
{
 y := x - 3;

}

