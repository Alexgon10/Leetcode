package ru.alex.leetcode.easy.tree;


/**
 * https://leetcode.com/problems/evaluate-boolean-binary-tree/
 */
public class EvaluateBooleanBinaryTree {

    public boolean evaluateTree(TreeNode root) {
        switch (root.val) {
            case 2: return evaluateTree(root.left) || evaluateTree(root.right);
            case 3: return evaluateTree(root.left) && evaluateTree(root.right);
        }
        return root.val == 1;
    }
}


