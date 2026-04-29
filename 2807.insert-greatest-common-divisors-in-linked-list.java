/*
 * @lc app=leetcode id=2807 lang=java
 *
 * [2807] Insert Greatest Common Divisors in Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null) {
      return head;
    }
    ListNode prev = head;
    ListNode curr = head.next;
    while (curr != null) {
      int a = prev.val;
      int b = curr.val;
      int min = Math.min(a,b);
      int gcd = 1;
      if (a % min == 0 && b % min == 0) {
        gcd = min;
      }
      else {
        for (int i = 2; i < min/2 + 1; i++) {
          if (a % i == 0 && b % i == 0) {
            gcd = i;
          }
        }
      }
      ListNode node = new ListNode(gcd);
      node.next = curr;
      prev.next = node;
      prev = curr;
      curr = curr.next;
    }
    return head;
    }
}
// @lc code=end

