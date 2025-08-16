#
# @lc app=leetcode id=83 lang=python
#
# [83] Remove Duplicates from Sorted List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        null = None
        temp = head
        while head != null and head.next != null:
            if head.val == head.next.val:
                head.next = head.next.next
            else:
                head = head.next
        return temp
        
# @lc code=end

