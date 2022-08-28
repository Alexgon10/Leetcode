package ru.alex.leetcode.easy.string;

/**\
 * https://leetcode.com/problems/goal-parser-interpretation/
 */
public class GoalParserInterpretation {
    public String interpret(String command) {
        return command.replace("()", "o")
                .replace("(al)", "al");

    }
}
