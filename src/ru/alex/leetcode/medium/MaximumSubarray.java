package ru.alex.leetcode.medium;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;
        int maxNum = nums[nums.length - 1];
        int currentSum = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            currentSum = nums[i] + currentSum;
            if (nums[i] > maxNum) {
                maxNum = nums[i];
            }
            if (currentSum < 0) {
                currentSum = 0;
            } else if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum > 0 ? maxSum : maxNum;
    }
}
