/*
 * @lc app=leetcode id=1305 lang=java
 *
 * [1305] All Elements in Two Binary Search Trees
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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> r1 = new ArrayList<Integer>();
        ArrayList<Integer> r2 = new ArrayList<Integer>();
        get(root1, r1);
        get(root2, r2);
        ArrayList<Integer> sorted = new ArrayList<>();
        int index = 0;
        int r1s = r1.size();
        int r2s = r2.size();
        int ir1 = 0;
        int ir2 = 0;
        while (ir1 != r1s && ir2 != r2s) {
            if (r1.get(ir1) > r2.get(ir2)) {
                sorted.add(r2.get(ir2));
                ir2++;
            }
            else {
                sorted.add(r1.get(ir1));
                ir1++;
            }
        }
        while (ir1 != r1s) {
            sorted.add(r1.get(ir1));
            ir1++;
        }
        while (ir2 != r2s) {
            sorted.add(r2.get(ir2));
            ir2++;
        }
        return sorted;
    }
    public void get(TreeNode root, ArrayList<Integer> res) {
        if (root == null) {
            return;
        }
        get(root.left, res);
        res.add(root.val);
        get(root.right, res);
    }
}
// @lc code=end

