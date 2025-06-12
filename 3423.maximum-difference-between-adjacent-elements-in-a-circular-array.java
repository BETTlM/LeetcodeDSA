/*
 * @lc app=leetcode id=3423 lang=java
 *
 * [3423] Maximum Difference Between Adjacent Elements in a Circular Array
 */

// @lc code=start
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        for (int i = 0; i<nums.length; i++) {
            int diff = Math.abs(nums[i] - nums[(i+1)%nums.length]);
            if (diff > maxDiff) {
                maxDiff = diff;
            } 
        }
        return maxDiff;
    }
}
// @lc code=end

