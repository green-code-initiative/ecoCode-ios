/*
 * Creedengo iOS plugin - Help the earth, adopt this green plugin for your applications
 * Copyright © 2024 green-code-initiative (https://green-code-initiative.org/)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.greencodeinitiative.creedengo.ios.swift.checks;

import org.greencodeinitiative.creedengo.ios.swift.antlr.generated.Swift5Parser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

public class CheckHelper {
    private static final String METHOD_CALL_PATTERN = ".%s(";
    public static final String END_OF_FILE = "<EOF>";

    private CheckHelper() {
    }

    /**
     * Utility method to check if the given import is present in the parse tree
     *
     * @param tree       the parse tree to check
     * @param importName the import name to check for
     * @return true if the import is effectively present in the parse tree
     */
    public static boolean isImportExisting(ParseTree tree, String importName) {
        return (tree instanceof Swift5Parser.Import_declarationContext &&
                tree.getText().contains(importName)
        );
    }

    /**
     * Utility method to check if a call to the given method or function is present in the parse tree
     *
     * @param tree       the parse tree to check
     * @param methodName the method name to check for call
     * @return true if the method is effectively called in the parse tree
     */
    public static boolean isFunctionCalled(ParseTree tree, String methodName) {
        return (tree instanceof Swift5Parser.ExpressionContext &&
                tree.getText().contains(String.format(METHOD_CALL_PATTERN, methodName)));
    }
    /**
     * Utility method to check if the given expression is present in the parse tree
     *
     * @param tree       the parse tree to check
     * @param expression the expression to check for presence
     * @return true if the expression is effectively used in the parse tree
     */
    public static boolean isExpressionPresent(ParseTree tree, String expression) {
        return (tree instanceof Swift5Parser.ExpressionContext &&
                tree.getText().contains(expression));
    }

    /**
     * Utility method to check if the parse tree represents the end of the analyzed file
     *
     * @param tree the parse tree to check
     * @return true if the end of file is reached within the parse tree
     */
    public static boolean isEndOfFile(ParseTree tree){
        return tree instanceof TerminalNodeImpl && tree.getText().equals(END_OF_FILE);
    }
}
