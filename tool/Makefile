
TOOL = src/main/java/org/VerificationTool
TARGET = target
GRAMMAR = Boogie
ANTLR = $(TOOL)/$(GRAMMAR)/*.java $(TOOL)/$(GRAMMAR)/*.interp $(TOOL)/$(GRAMMAR)/*.tokens

all: grammar app

app: $(TOOL)/App.java
	mvn package

grammar: $(TOOL)/$(GRAMMAR).g4
	java org.antlr.v4.Tool $(TOOL)/$(GRAMMAR).g4 -package org.VerificationTool.$(GRAMMAR) -o Boogie/
	
clean:
	rm -r target $(ANTLR)
