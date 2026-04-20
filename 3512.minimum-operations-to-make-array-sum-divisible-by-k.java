/*
 * @lc app=leetcode id=3512 lang=java
 *
 * [3512] Minimum Operations to Make Array Sum Divisible by K
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int k) {
        int total = 0;
        for (int i : nums) {
            total += i;
        }
        return total % k;
    }
}
// @lc code=end

