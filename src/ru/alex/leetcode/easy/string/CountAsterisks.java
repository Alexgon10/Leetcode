package ru.alex.leetcode.easy.string;

/**
 * https://leetcode.com/problems/count-asterisks/
 */
public class CountAsterisks {
    public int countAsterisks(String s) {
        boolean isPair = false;
        int result = 0;
        for (Character c : s.toCharArray()) {
            if (c == '|') {
                isPair = !isPair;
            } else if (!isPair && c == '*') {
                result++;
            }
        }
        return result;
    }
}
