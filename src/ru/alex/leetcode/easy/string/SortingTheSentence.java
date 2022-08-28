package ru.alex.leetcode.easy.string;

/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class SortingTheSentence {
    public String sortSentence(String s) {
        String[] array = s.split(" ");
        String[] result = new String[array.length];
        for (String w : array) {
            int ch = w.charAt(w.length() - 1) - '1';    // ascii code - ascii code of 1 = int ( for ex 50 - 49 = 1)
            result[ch] = w.substring(0, w.length() - 1);
        }
        return String.join(" ", result);
    }

}
