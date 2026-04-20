/*
 * @lc app=leetcode id=3701 lang=java
 *
 * [3701] Compute Alternating Sum
 */

// @lc code=start
class Solution {
    public int alternatingSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 1) {
                result -= nums[i];
            }
            else {
                result += nums[i];
            }
        }
        return result;
    }
}
// @lc code=end

