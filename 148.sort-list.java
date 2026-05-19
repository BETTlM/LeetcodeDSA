/*
 * @lc app=leetcode id=148 lang=java
 *
 * [148] Sort List
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> ll = new ArrayList<>();
        while (head != null) {
            ll.add(head.val);
            head = head.next;
        }
        Collections.sort(ll);
        ListNode dummy = new ListNode(-1);
        ListNode ret = dummy;
        for (int i : ll) {
            dummy.next = new ListNode(i);
            dummy = dummy.next;
        }
        return ret.next;
        
    }
}
// @lc code=end

