package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/root-equals-sum-of-children/
 */
public class RootEqualsSumOfChildren {
    public boolean checkTree(TreeNode root) {
        return (root.left.val + root.right.val) == root.val;
    }

}
