package ru.alex.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        List<Integer> list = new ArrayList<>();
        while (x / 10 >= 1) {
            list.add(x % 10);
            x = x / 10;
        }
        list.add(x % 10);
        for (int i = 0, j = list.size() - 1; i < list.size() / 2; i++, j--) {
            if (!list.get(i).equals(list.get(j))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(int x) {
       StringBuilder sb = new StringBuilder(String.valueOf(x));

        System.out.println("-- " + sb.toString());
        System.out.println("-- " + sb.reverse().toString());
        System.out.println("-- " + String.valueOf(x).equals(sb.reverse().toString()));
       return String.valueOf(x).equals(sb.reverse().toString());

    }

    public static void main(String[] args) {
//        System.out.println(PalindromeNumber.isPalindrome(123321));
//        System.out.println(PalindromeNumber.isPalindrome(123454321));
//        System.out.println(PalindromeNumber.isPalindrome(122323121));


        System.out.println(PalindromeNumber.isPalindrome2(123321));
        System.out.println(PalindromeNumber.isPalindrome2(123454321));
        System.out.println(PalindromeNumber.isPalindrome2(122323121));
    }

}
