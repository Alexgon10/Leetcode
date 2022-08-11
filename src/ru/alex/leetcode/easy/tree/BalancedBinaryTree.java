package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 */
public class BalancedBinaryTree {
    /**
     * должны проверять все поддеревья так как может быть такое что длина грубина левого и правого поддерева
     * одинаковая на они не сбалансированы
     */
    public boolean isBalanced(TreeNode root) {
        if (root==null){
            return true;
        }
        if(Math.abs(maxDepth(root.left) - maxDepth(root.right)) >1) {
            return false;
        } else return isBalanced(root.left) && isBalanced(root.right);
    }

    public int maxDepth(TreeNode root) {
        if(root==null)
            return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
