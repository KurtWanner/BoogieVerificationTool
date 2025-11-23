
var y:int;
var z:int;

procedure foo (x:int)
requires x >= 3;
requires x > 1;
modifies y;
ensures (y == x - 3 && y >= 0);
{
 y := x - 3;

 if(z > 0 && z < 0) {
  y := x - 10;
 }

}

