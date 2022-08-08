package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/length-of-last-word/
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        s.trim();
        String[] words = s.split(" ");
        return words[words.length - 1].length();
    }
}
