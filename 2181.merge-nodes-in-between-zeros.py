#
# @lc app=leetcode id=2181 lang=python
#
# [2181] Merge Nodes in Between Zeros
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeNodes(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        head = head.next
        start = head
        while start:
            end = start  
            sum = 0
            while end.val != 0:
                sum += end.val
                end = end.next
            start.val = sum  
            start.next = end.next  
            start = start.next 
        return head
        
# @lc code=end

