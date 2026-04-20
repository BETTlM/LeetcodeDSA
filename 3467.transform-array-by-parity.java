/*
 * @lc app=leetcode id=3467 lang=java
 *
 * [3467] Transform Array by Parity
 */

// @lc code=start
class Solution {
    public int[] transformArray(int[] nums) {
        int even = 0;
        int odd = 0;
        for (int i : nums) {
            if (i % 2 == 0) {
                even += 1;
            }
            else {
                odd += 1;
            }
        }
        int[] result = new int[odd + even];
        for (int i = even; i < even + odd; i++) {
            result[i] = 1;
        }
        return result;
    }
}
// @lc code=end

