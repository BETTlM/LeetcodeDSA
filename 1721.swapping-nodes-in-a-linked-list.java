/*
 * @lc app=leetcode id=1721 lang=java
 *
 * [1721] Swapping Nodes in a Linked List
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode run = head;
        for (int i = 0; i < k; i++) {
            run = run.next;
        }
        ListNode ender = head;
        while (run != null) {
            ender = ender.next;
            run = run.next;
        }
        ListNode starter = head;
        for (int i = 0; i < k - 1; i++) {
            starter = starter.next;
        }
        int temp = ender.val;
        ender.val = starter.val;
        starter.val = temp;
        return head;
    }
}
// @lc code=end

