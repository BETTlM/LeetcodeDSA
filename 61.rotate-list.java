/*
 * @lc app=leetcode id=61 lang=java
 *
 * [61] Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
       int size = 0;
        if (k == 0 || head == null || head.next == null) {
            return head;
        }
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        ListNode p1 = head;
        ListNode p2 = head;
        k = k % size;
        if (k == 0) {
            return head;
        }
        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }
        while (p1.next != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        ListNode temp2 = p2;
        p2 = p2.next;
        temp2.next = null;
        p1.next = head;
        return p2 ;   
    }
}
// @lc code=end

