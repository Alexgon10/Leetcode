package ru.alex.leetcode.easy.string;

/**
 * https://leetcode.com/problems/shuffle-string/
 */
public class ShuffleString {
    public String restoreString(String s, int[] indices) {
        StringBuilder result = new StringBuilder(s);
        for (int i=0; i<indices.length; i++ ){
            result.setCharAt(indices[i], s.charAt(i));
        }
        return result.toString();
    }

    /**
     * 2nd way (better)
     */
    public String restoreString2(String s, int[] indices) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            arr[indices[i]] = s.charAt(i);
        }
        return String.valueOf(arr);
    }
}
