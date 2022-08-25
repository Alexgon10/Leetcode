package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/path-sum/
 */
public class PathSum {
    private int target;
    private boolean result;
    private int currentSum = 0;
    public boolean hasPathSum(TreeNode root, int targetSum) {
        target = targetSum;
        countPathSum(root);
        return result;
    }

    public TreeNode countPathSum(TreeNode root) {
        if (root==null){
            return null;
        }
        currentSum = currentSum + root.val;
        if (!result){
            TreeNode left = countPathSum(root.left);
            TreeNode right = countPathSum(root.right);
            if (left==null && right == null && target==currentSum){
                result = true;
            }
            currentSum -= root.val;
        }
        return root;
    }
}
