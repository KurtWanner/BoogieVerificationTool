
# Steps of Program

* Parse

* Pull specifications

* Produce new boogie program

* Evaluate new boogie program

* Report potential errors

What are types of specification errors to check:

* Unsatisfiable preconditions
*  

How to check for specification errors:

* Unnecessary preconditions
    - Negate each premise
    - If any return satisfiable,
    - Then premise is unnecessary

* Vacuously true
    - Remove procedure implementation
    - Negate ensures clauses
    - If verified, then unsatisfiable preconditions 

* Trivially true
    - Remove preconditions
    - Remove implementation
    - If sat, then trivially true


# TODO

- [X] Set up minimally viable project
- [ ] Construct Boogie grammar
- [ ] Test boogie grammar
 
