package ru.alex.leetcode.easy;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {
        public int majorityElement(int[] nums) {
            if(nums.length==1){
                return nums[0];
            }
            int count=0;
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i=0; i< nums.length; i++){
                if (map.containsKey(nums[i])){
                    count = map.get(nums[i])+1;
                    if (count > nums.length/2){
                        return nums[i];
                    }
                    map.put(nums[i], count);
                }else map.put(nums[i],1);
            }
            return -1;
    }
}
