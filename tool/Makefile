
TOOL = src/main/java/org/VerificationTool
TARGET = target
GRAMMAR = Boogie
ANTLR = $(TOOL)/$(GRAMMAR)/*.java $(TOOL)/$(GRAMMAR)/*.interp $(TOOL)/$(GRAMMAR)/*.tokens

all: grammar app

app: $(TOOL)/App.java
	mvn compile

grammar: $(TOOL)/$(GRAMMAR)/$(GRAMMAR).g4
	java org.antlr.v4.Tool $(TOOL)/$(GRAMMAR)/$(GRAMMAR).g4 -package org.VerificationTool.$(GRAMMAR)
	
clean:
	rm -r target $(ANTLR)
