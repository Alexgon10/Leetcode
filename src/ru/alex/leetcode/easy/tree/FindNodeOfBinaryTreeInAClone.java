package ru.alex.leetcode.easy.tree;

/**
 * https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree/
 */
public class FindNodeOfBinaryTreeInAClone {

    TreeNode targetCloneNode;
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        inOrderTraverse(cloned,target);
        return targetCloneNode;
    }

    public void inOrderTraverse(TreeNode node, TreeNode target){
        if (node==null || targetCloneNode!=null){
            return;
        }
        if (isTarget(node, target)){
            targetCloneNode = node;
            return;
        }
        inOrderTraverse(node.left, target);
        inOrderTraverse(node.right, target);
    }

    private boolean isTarget(TreeNode node, TreeNode target){
        return node.val == target.val
                && ((node.left==null && target.left==null) || (node.left.val == target.left.val))
                && ((node.right==null && target.right==null) || (node.right.val == target.right.val));
    }


    /**
     * 2 way
     */
    public final TreeNode getTargetCopy2(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null)
            return null;
        if (target == original)
            return cloned;
        TreeNode dest = getTargetCopy(original.left, cloned.left, target);
        if (dest == null)
            dest = getTargetCopy(original.right, cloned.right, target);
        return dest;
    }
}
