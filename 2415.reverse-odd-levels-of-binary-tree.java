/*
 * @lc app=leetcode id=2415 lang=java
 *
 * [2415] Reverse Odd Levels of Binary Tree
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
    public void revOdd(TreeNode root1, TreeNode root2, int level){ 
        if((root1.left == null) || (root2.left == null)) {
            return;
        }
        if(level % 2 == 0){
            int temp = root1.left.val;
            root1.left.val = root2.right.val;
            root2.right.val = temp;
        }  
        revOdd(root1.left, root2.right, level+1);
        revOdd(root1.right, root2.left, level+1);    
    }
    
    public TreeNode reverseOddLevels(TreeNode root) { 
        revOdd(root, root, 0);
        return root;
    }
}
// @lc code=end

