#
# @lc app=leetcode id=145 lang=python
#
# [145] Binary Tree Postorder Traversal
#

# @lc code=start
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def postorderTraversal(self, root):
        """
        :type root: Optional[TreeNode]
        :rtype: List[int]
        """
        res = []
        def postorder(root, res):
            if root is None:
                return 
            postorder(root.left, res)
            postorder(root.right, res)
            res.append(root.val)
        postorder(root, res)
        return res
    
# @lc code=end

