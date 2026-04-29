/*
 * @lc app=leetcode id=1669 lang=java
 *
 * [1669] Merge In Between Linked Lists
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        ListNode head = curr;
        for (int i = 1; i < a; i++) {
            curr = curr.next;
        }
        ListNode remover = curr;
        for (int i = -1; i < b - a; i++) {
            remover = remover.next;
        }
        ListNode temp = remover;
        remover = remover.next;
        temp.next = null;
        temp = null;
        curr.next = list2;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = remover;
        return head;
    }
}
// @lc code=end

