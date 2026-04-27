/*
 * @lc app=leetcode id=3736 lang=java
 *
 * [3736] Minimum Moves to Equal Array Elements III
 */

// @lc code=start
class Solution {
    public int minMoves(int[] nums) {
        int ma = Integer.MIN_VALUE;
        int su = 0;
        for (int i : nums) {
            ma = Math.max(ma, i);
            su += i;
        }
        return (ma * nums.length) - su;
    }
}
// @lc code=end

