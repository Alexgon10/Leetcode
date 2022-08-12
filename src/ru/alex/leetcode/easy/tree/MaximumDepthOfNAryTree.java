package ru.alex.leetcode.easy.tree;


/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 */
public class MaximumDepthOfNAryTree {
    public int maxDepth(Node root) {
        if (root==null){
            return 0;
        }
        int max = 0;
        for (Node node: root.children){
            max = Math.max(max, maxDepth(node));
        }
        return max + 1;
    }
}
