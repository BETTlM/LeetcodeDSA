/*
 * @lc app=leetcode id=897 lang=java
 *
 * [897] Increasing Order Search Tree
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
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> sorted = new ArrayList<>();
       dfs(root, sorted); 
       TreeNode root1 = new TreeNode(sorted.get(0));
       TreeNode ret = root1;
       for (int i = 1; i < sorted.size(); i++) {
        root1.right = new TreeNode(sorted.get(i));
        root1 = root1.right;
       }
       return ret;
    }
    public void dfs(TreeNode root, ArrayList<Integer> sorted) {
        if (root == null) {
            return;
        }
        dfs(root.left, sorted);
        sorted.add(root.val);
        dfs(root.right, sorted);
    }
}
// @lc code=end

