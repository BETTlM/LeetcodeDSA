#
# @lc app=leetcode id=206 lang=python
#
# [206] Reverse Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        newHead = None
        if head == None:
            return None
        if head.next == None:
            return head
        while head != None:
            next = head.next
            head.next = newHead
            newHead = head
            head = next
        return newHead
        
# @lc code=end

