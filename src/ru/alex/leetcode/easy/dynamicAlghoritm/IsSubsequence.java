package ru.alex.leetcode.easy.dynamicAlghoritm;

public class IsSubsequence {
    private int startPos = 0;
    private String text;
    int textSize;

    public boolean isSubsequence(String pattern, String text) {

        int patternSize = pattern.length();
        textSize = text.length();
        if (patternSize > textSize) {
            return false;
        }
        this.text = text;
        for (int i = 0; i < patternSize; i++) {
            startPos = findSymbolPosition(pattern.charAt(i), startPos);
            if (startPos == -1 || (textSize-startPos) < (patternSize-i)) {
                return false;
            }
            startPos++;
        }
        return true;
    }
    private int findSymbolPosition(char c, int startPosition) {
        for (int j = startPosition; j < textSize; j++) {
            if (text.charAt(j) == c) {
                return j;
            }
        }
        return -1;
    }


    /**
     * 2 way
     */
    public boolean isSubsequence2(String s, String t) {
        if (s.length() == 0) return true;
        if (t.length() == 0) return false;
        int letter = 0;
        for (int i = 0; i < t.length(); i++) {
            if (s.charAt(letter) == t.charAt(i)) {
                letter++;
                if (letter >= s.length()) return true;
            }
        }
        return false;
    }

}
