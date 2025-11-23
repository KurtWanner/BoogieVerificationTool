package org.VerificationTool;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class App {
    public static void main(String[] args) {
        // Input string
        String input;
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

        // Create lexer
        ExprLexer lexer = new ExprLexer(cs);

        // Token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser
        ExprParser parser = new ExprParser(tokens);

        // Parse starting from 'expr' rule
        ParseTree tree = parser.expr();

        // Print parse tree
        System.out.println(tree.toStringTree(parser));

    }
}