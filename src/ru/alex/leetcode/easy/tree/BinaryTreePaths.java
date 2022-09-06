package ru.alex.leetcode.easy.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-paths/
 */
public class BinaryTreePaths {
    private List<String> paths = new ArrayList<String>();
    private String path;

    public List<String> binaryTreePaths(TreeNode root) {
        findPath(root, path);
        return paths;
    }

    private TreeNode findPath(TreeNode root, String path) {
        if (root == null) {
            return null;
        }
        if (path == null) {
            path = Integer.toString(root.val);
        } else path = path.concat("->").concat(Integer.toString(root.val));
        TreeNode left = findPath(root.left, path);
        TreeNode right = findPath(root.right, path);
        if (left == null && right == null) {
            paths.add(path);
        }
        return root;
    }
}
