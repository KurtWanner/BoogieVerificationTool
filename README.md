


# Antlr4

https://github.com/antlr/antlr4/blob/master/doc/getting-started.md
1. java org.antlr.v4.Tool Boogie.g4 - o
    - Produces .java files 

2. javac Boogie*.java
    - Compiles

3. Do Stuff
    * grun Boogie r -tree < test.txt
        - parse tree 
    * grun Hello r -gui < test.txt
        - gui tree

# Maven
* Compiling
    - mvn compile
    - mvn package //.jar
    - mvn clean

# Prerequisites
- Antlr4
- Boogie
- Z3
- Maven