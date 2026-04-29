#
# @lc app=leetcode id=2130 lang=python
#
# [2130] Maximum Twin Sum of a Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def pairSum(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: int
        """
        l = []
        left = 0
        right = -1
        while head is not None:
            l.append(head.val)
            head = head.next
            right += 1
        ts = -float('inf')
        while left < right:
            ts = max(ts, l[left] + l[right])
            left += 1
            right -= 1
        return ts
        
# @lc code=end

