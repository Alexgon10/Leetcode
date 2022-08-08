package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/sqrtx/
 *
 * https://ru.algorithmica.org/cs/numerical/newton/
 */
public class Sqrt {
    public int mySqrt(int x) {
        if (x < 1) return 0;
        long v = x;
        while (v > x / v)
            v = (v + x / v) / 2;
        return (int) v;
    }
}
