/*
 * @lc app=leetcode id=938 lang=java
 *
 * [938] Range Sum of BST
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
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        int cv;
        if (root.val >= low && root.val <= high) {
            cv = root.val;
        }
        else {
            cv = 0;
        }
        int rs = rangeSumBST(root.right, low, high);
        int ls = rangeSumBST(root.left, low, high);
        return cv + rs + ls;
    }
}
// @lc code=end

