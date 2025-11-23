
ANTLR = src/main/antlr4
TOOL = src/main/java/org/VerificationTool
TARGET = target
GRAMMAR = boogie

all: antlr app

app: $(TOOL)/App.java
	mvn package

antlr: $(ANTLR)/$(GRAMMAR).g4 antlrClasses
	javac $(TARGET)/antlr/$(ANTLR)/boogie*.java

antlrClasses: $(ANTLR)/$(GRAMMAR).g4
	java org.antlr.v4.Tool $(ANTLR)/$(GRAMMAR).g4 -o $(TARGET)/antlr

clean:
	rm -r target
