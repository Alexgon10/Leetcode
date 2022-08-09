package ru.alex.leetcode.easy;


public class EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        switch (root.val) {
            case 2: return evaluateTree(root.left) || evaluateTree(root.right);
            case 3: return evaluateTree(root.left) && evaluateTree(root.right);
        }
        return root.val == 1;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}


