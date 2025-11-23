
TOOL = src/main/java/org/VerificationTool
TARGET = target
GRAMMAR = Boogie
ANTLR = $(TOOL)/$(GRAMMAR)/$(GRAMMAR)/*.java $(TOOL)/$(GRAMMAR)/$(GRAMMAR)/*.interp $(TOOL)/$(GRAMMAR)/$(GRAMMAR)/*.tokens

all: grammar app

app: $(TOOL)/App.java
	mvn package

grammar: $(TOOL)/$(GRAMMAR)/$(GRAMMAR).g4
	java org.antlr.v4.Tool $(TOOL)/$(GRAMMAR)/$(GRAMMAR).g4 -package org.VerificationTool.$(GRAMMAR)
	
clean:
	rm -r target $(ANTLR)
