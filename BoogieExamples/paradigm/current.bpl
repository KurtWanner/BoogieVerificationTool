// VALID : 
var x:int;

procedure foo ()
modifies x;
ensures x == 0;
{
  x := 1;
}

