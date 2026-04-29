/*
 * @lc app=leetcode id=3217 lang=java
 *
 * [3217] Delete Nodes From Linked List Present in Array
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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode t = dummy;
        HashSet<Integer> nms = new HashSet<>();
        for (int i : nums) {
            nms.add(i);
        }
        while (head != null) {
            if (!nms.contains(head.val)) {
                dummy.next = new ListNode(head.val);
                dummy = dummy.next;
            }
            head = head.next;
        }
        return t.next;
    }
}
// @lc code=end

