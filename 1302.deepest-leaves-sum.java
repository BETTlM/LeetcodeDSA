/*
 * @lc app=leetcode id=1302 lang=java
 *
 * [1302] Deepest Leaves Sum
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int s = 0;
    public int deepestLeavesSum(TreeNode root) {
        int depth = maxDepth(root);
        helper(root, depth);
        return s;
    }

    public void helper(TreeNode root, int depth) {
        if (depth == 1) {
            if (root != null) {
                s += root.val;
            }
        }
        if (root != null) {
            helper(root.left, depth - 1);
            helper(root.right, depth - 1);
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
// @lc code=end

