/*
 * @lc app=leetcode id=3065 lang=java
 *
 * [3065] Minimum Operations to Exceed Threshold Value I
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int k) {
       int c = 0;
    for (int i : nums) {
    if (i < k) {
        c++;
      }
    }
    return c;
     
    }
}
// @lc code=end

