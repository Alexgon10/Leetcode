package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/fibonacci-number/
 */
public class FibonacciNumber {

    private int[] cache;

    public int fib(int n) {
        cache = new int[n+2];
        cache[0] = 0;
        cache[1] = 1;
        return calculate(n);
    }

    public int calculate(int num){
        if (cache[num]!=0 || num == 0){
            return cache[num];
        }
        int value = calculate(num-1) + calculate(num-2);
        cache[num] = value;
        return value;
    }
}
