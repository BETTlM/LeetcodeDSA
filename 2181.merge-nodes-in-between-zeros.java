/*
 * @lc app=leetcode id=2181 lang=java
 *
 * [2181] Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) {
        ListNode org = head;
        ListNode temp = head.next;
        int sum = 0;

        while(temp != null){
            if(temp.val == 0){
                head.val = sum ;
                sum = 0;
                if(temp.next != null){
                    head = head.next;
                }
            }
            else{
                sum = sum + temp.val;
            }
            temp = temp.next;
        }
        head.next = null;

        return org;
    }
}
// @lc code=end

