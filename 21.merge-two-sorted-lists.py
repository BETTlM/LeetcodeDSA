#
# @lc app=leetcode id=21 lang=python
#
# [21] Merge Two Sorted Lists
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def mergeTwoLists(self, list1, list2):
        """
        :type list1: Optional[ListNode]
        :type list2: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        null = None
        if (list1 != null and list2 != null):
            if list1.val > list2.val:
                list2.next = self.mergeTwoLists(list2.next, list1)
                return list2
            else:
                list1.next = self.mergeTwoLists(list1.next, list2)
                return list1
        if list1 == null:
            return list2
        return list1
# @lc code=end

