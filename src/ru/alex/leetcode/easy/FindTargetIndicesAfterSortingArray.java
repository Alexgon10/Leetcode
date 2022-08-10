package ru.alex.leetcode.easy;

import java.util.*;

/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */
public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] nums, int target) {
        var targetCount = 0;
        var smallerCount = 0;

        for (var num : nums)
            if (num == target)
                targetCount++;
            else if (num < target)
                smallerCount++;

        var targets = new ArrayList<Integer>();
        for (var i = smallerCount; i < targetCount + smallerCount; i++)
            targets.add(i);
        return targets;
    }

}
