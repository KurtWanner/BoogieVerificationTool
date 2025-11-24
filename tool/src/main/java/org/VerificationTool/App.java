package org.VerificationTool;

import org.VerificationTool.Boogie.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) {
        // Input string
        String input = "";
        if (args.length > 0) {
            input = args[0];
        } else {
            System.err.println("Usage: java org.VerificationTool.App <input>");
            System.exit(1);
        }
                
        // Convert input into a CharStream
        CharStream cs;
        try {
            cs = CharStreams.fromFileName(input);
        } catch (java.io.IOException e) {
            System.err.println("Failed to open input file: " + e.getMessage());
            System.exit(1);
            return;
        }

        BoogieLexer lexer = new BoogieLexer(cs);

        CommonTokenStream tokens = new CommonTokenStream(lexer);

        BoogieParser parser = new BoogieParser(tokens);

        ParseTree tree = parser.spec();

        System.out.println(tree.toStringTree(parser));

    }
}