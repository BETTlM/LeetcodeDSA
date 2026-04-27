/*
 * @lc app=leetcode id=3300 lang=java
 *
 * [3300] Minimum Element After Replacement With Digit Sum
 */

// @lc code=start
class Solution {
    public int minElement(int[] nums) {
        int mins = Integer.MAX_VALUE;
        for (int i : nums) {
            int s = 0;
            while (i > 0) {
                s += i % 10;
                i /= 10;
            }
            mins = Math.min(mins, s);
        }
        return mins;
    }
}
// @lc code=end

