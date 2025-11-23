//

var y:int;
var z:int;

procedure foo (x:int)
requires x > 3 && x < 3;
modifies y, z;
ensures y == x - 3;
{
 y := x - 3;


}

