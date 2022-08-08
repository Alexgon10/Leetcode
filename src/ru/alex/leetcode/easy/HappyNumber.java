package ru.alex.leetcode.easy;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {
    private HashSet<Integer> set = new HashSet<>();

    public boolean isHappy(int n) {

        while (!isContains(n)) {
            n = getNewDigit(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public int getNewDigit(int num) {
        int newNum = 0;
        while (num / 10 > 0) {
            newNum += (num % 10) * (num % 10);
            num = num / 10;
        }
        newNum += (num % 10) * (num % 10);
        return newNum;
    }

    public boolean isContains(int num) {
        if (set.contains(num)) {
            return true;
        } else {
            set.add(num);
            return false;
        }
    }
}
