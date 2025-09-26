#
# @lc app=leetcode id=61 lang=python
#
# [61] Rotate List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):
        """
        :type head: Optional[ListNode]
        :type k: int
        :rtype: Optional[ListNode]
        """
        size = 0
        temp = head
        if head == None:
            return None
        while head != None:
            head = head.next
            size += 1
        k = k % size
        if k == 0:
            return temp
        p1 = temp
        p2 = temp
        for i in range(k):
            p1 = p1.next
        while p1.next != None:
            p1 = p1.next
            p2 = p2.next
        temp2 = p2
        p2 = p2.next
        temp2.next = None
        p1.next = temp
        return p2
# @lc code=end

