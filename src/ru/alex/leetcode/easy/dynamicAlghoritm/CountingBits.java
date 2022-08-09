package ru.alex.leetcode.easy.dynamicAlghoritm;


/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
        private int [] cache ;

        public int[] countBits(int n) {
            cache = new int[n + 2] ;
            cache[0] = 0;
            cache[1] = 1;
            int [] result = new int[n + 1];
            for (int i = 0; i <= n; i++) {
                result[i] = countNum(i);
            }
            return result;
        }

        private int countNum(int num) {
            if (cache[num]!= 0 ||  num == 0) {
                return cache[num];
            }
            int value = num % 2 + countNum(num / 2);
            cache[num] = value;
            return value;
        }
}
