#
# @lc app=leetcode id=2807 lang=python
#
# [2807] Insert Greatest Common Divisors in Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def insertGreatestCommonDivisors(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        node = head
        def gcd(a, b):
            return a if b == 0 else gcd(b, a % b)
        while node.next:
           node.next, node = ListNode(gcd(node.val, node.next.val), node.next), node.next
        return head
        
# @lc code=end

