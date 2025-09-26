#
# @lc app=leetcode id=1290 lang=python
#
# [1290] Convert Binary Number in a Linked List to Integer
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def getDecimalValue(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        n = 0
        while head != None:
            n = (n << 1) | head.val
            head = head.next
        return n
        
# @lc code=end

