package ru.alex.leetcode.easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
        public int removeDuplicates(int[] nums) {
            int counter=1;
            for(int i=1; i < nums.length ; i++){
                if (nums[i]!=nums[i-1]){
                    nums[counter++] = nums[i];
                }
            }
            return counter;
    }
}
