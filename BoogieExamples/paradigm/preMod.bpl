var x:int;

procedure foo ()
requires false; // Unsatisfiable preconditions
modifies x;
ensures x == 0;
{
  x := 1;
}

