#
# @lc app=leetcode id=1669 lang=python
#
# [1669] Merge In Between Linked Lists
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeInBetween(self, list1, a, b, list2):
        """
        :type list1: ListNode
        :type a: int
        :type b: int
        :type list2: ListNode
        :rtype: ListNode
        """
        curr = list1
        head = curr
        for _ in range(1,a):
            curr = curr.next
        remover = curr
        for _ in range(-1, b - a):
            remover = remover.next
        temp = remover
        remover = remover.next
        temp.next = None
        temp = None
        curr.next = list2
        while (curr.next is not None):
            curr = curr.next
        curr.next = remover
        return head
# @lc code=end

