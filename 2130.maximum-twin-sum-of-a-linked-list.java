/*
 * @lc app=leetcode id=2130 lang=java
 *
 * [2130] Maximum Twin Sum of a Linked List
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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode prev=null;
        ListNode curr=slow;
        while(curr!=null){
            ListNode newNode=curr.next;
            curr.next=prev;
            prev=curr;
            curr=newNode;
        }
        int maxSum=0;
        ListNode first=head;
        ListNode second=prev;
        while(second!=null){
            int sum=first.val+second.val;
            maxSum=Math.max(maxSum,sum);
            first=first.next;
            second=second.next;
        }
        return maxSum;
    }
}
// @lc code=end

