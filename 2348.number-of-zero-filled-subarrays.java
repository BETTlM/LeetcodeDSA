/*
 * @lc app=leetcode id=2348 lang=java
 *
 * [2348] Number of Zero-Filled Subarrays
 */

// @lc code=start
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long window = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                window++;
                count = count + window;
            }
            else {
                window = 0;
            }
        }
    return count;
    }
}

// @lc code=end

