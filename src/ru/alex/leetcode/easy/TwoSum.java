package ru.alex.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i=0; i < nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i=0; i < nums.length; i++){
            if (map.get(target - nums[i]) != null && map.get(target - nums[i])!=i){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                break;
            }
        }
        return result;
    }
}