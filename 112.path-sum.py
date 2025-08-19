#
# @lc app=leetcode id=112 lang=python
#
# [112] Path Sum
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def hasPathSum(self, root, targetSum):
        """
        :type root: Optional[TreeNode]
        :type targetSum: int
        :rtype: bool
        """
        if root == None:
            return False
        if root.right == None and root.left == None:
            return targetSum == root.val
        leftSum = self.hasPathSum(root.left, targetSum - root.val)
        rightSum = self.hasPathSum(root.right, targetSum - root.val)
        return leftSum or rightSum
        
# @lc code=end

