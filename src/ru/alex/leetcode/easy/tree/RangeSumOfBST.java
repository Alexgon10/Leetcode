package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumOfBST {
    private int sum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val <= high && root.val >= low) {
            sum += root.val;
            rangeSumBST(root.left, low, high);
            rangeSumBST(root.right, low, high);
        } else if (root.val > high) {
            rangeSumBST(root.left, low, high);
        } else {
            rangeSumBST(root.right, low, high);
        }
        return sum;
    }
}
