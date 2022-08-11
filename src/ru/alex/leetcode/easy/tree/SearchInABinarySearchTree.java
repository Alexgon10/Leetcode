package ru.alex.leetcode.easy.tree;


/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 */
public class SearchInABinarySearchTree {
    TreeNode result;

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) {
            return null;
        }
        if (root.val == val) {
            result = root;
        } else if (root.val > val) {
            searchBST(root.left, val);
        } else {
            searchBST(root.right, val);
        }
        return result;
    }
}
