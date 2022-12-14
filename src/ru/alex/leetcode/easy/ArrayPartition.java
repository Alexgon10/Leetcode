package ru.alex.leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/array-partition/
 */
public class ArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i<nums.length-1; i = i+2) {
            result += Math.min(nums[i],nums[i+1]);
        }
        return result;
    }
}
