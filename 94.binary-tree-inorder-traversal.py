#
# @lc app=leetcode id=94 lang=python
#
# [94] Binary Tree Inorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def inorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        res = []
        def inOrder(root, res):
            if root == None:
                return
            inOrder(root.left, res)
            res.append(root.val)
            inOrder(root.right, res)
        inOrder(root, res)
        return res
        
# @lc code=end

