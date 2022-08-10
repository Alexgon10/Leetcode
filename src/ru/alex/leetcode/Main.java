package ru.alex.leetcode;

import ru.alex.leetcode.easy.FindTargetIndicesAfterSortingArray;
import ru.alex.leetcode.easy.ValidPalindrome;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        FindTargetIndicesAfterSortingArray findTargetIndicesAfterSortingArray = new FindTargetIndicesAfterSortingArray();
        int[] nums = new int[]{1};
        System.out.println(findTargetIndicesAfterSortingArray.targetIndices(nums,1));
    }
}
