package ru.alex.leetcode.easy.string;

/**
 * https://leetcode.com/problems/split-a-string-in-balanced-strings/
 */
public class SplitStringInBalancedStrings {
    public int balancedStringSplit(String s) {
        int result = 0;
        int r = 0;
        int l = 0;
        for (int i= 0; i< s.length(); i++){
            if (s.charAt(i)=='R'){
                r++;
            } else l++;
            if (r==l){
                result++;
            }
        }
        return result;
    }
}
