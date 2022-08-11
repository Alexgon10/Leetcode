package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 == null) {
            return null;
        }
        if (root1 != null && root2 != null) {
            root1.val += root2.val;

            if (root1.left == null) {
                root1.left = root2.left;
            } else mergeTrees(root1.left, root2.left);

            if (root1.right == null) {
                root1.right = root2.right;
            } else mergeTrees(root1.right, root2.right);
        }
        if (root1 == null) {
            root1 = root2;
        }
        return root1;
    }

    /**
     * 2 way
     */
    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }
}
