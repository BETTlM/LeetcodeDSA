#
# @lc app=leetcode id=144 lang=python
#
# [144] Binary Tree Preorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def preorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        res = []
        def preorder(root, res):
            if root is None:
                return
            res.append(root.val)
            preorder(root.left, res)
            preorder(root.right, res)
        preorder(root, res)
        return res
# @lc code=end

