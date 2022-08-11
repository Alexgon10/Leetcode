package ru.alex.leetcode.medium.tree;


/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {
    private boolean result = true;
    private long currentVal = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        if (result) {
            isValidBST(root.left);
        }
        if (root.val > currentVal) {
            currentVal = root.val;
        } else result = false;
        if (result) {
            isValidBST(root.right);
        }
        return result;
    }
}
