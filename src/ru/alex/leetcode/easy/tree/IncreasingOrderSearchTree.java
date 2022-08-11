package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 */
public class IncreasingOrderSearchTree {
    private TreeNode result;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        }
        increasingBST(root.right);
        root.right = result;
        result = root;
        increasingBST(root.left);
        root.left = null;

        return result;
    }

}
