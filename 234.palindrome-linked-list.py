#
# @lc app=leetcode id=234 lang=python
#
# [234] Palindrome Linked List
#

# @lc code=start
# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        if head == None or head.next == None:
            return True
        slow = head
        fast = head
        while fast != None and fast.next != None:
            fast = fast.next.next
            slow = slow.next
        second = self.reverse(slow)
        p1 = head
        p2 = second
        flag = True
        while p2 != None:
            if p1.val != p2.val:
                flag = False
                break
            p1 = p1.next
            p2 = p2.next
        self.reverse(second)
        return flag
    
    def reverse(self, head):
        newHead = None
        while head != None:
            next = head.next
            head.next = newHead
            newHead = head
            head = next
        return newHead
    
# @lc code=end

