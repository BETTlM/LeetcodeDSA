#
# @lc app=leetcode id=222 lang=python
#
# [222] Count Complete Tree Nodes
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def countNodes(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: int
        """
        return self.findNull(root) - 1
    
    def findNull(self, root):
        if root == None:
            return 1
        left = self.findNull(root.left)
        right = self.findNull(root.right)
        return left + right
        
# @lc code=end

