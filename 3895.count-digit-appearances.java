/*
 * @lc app=leetcode id=3895 lang=java
 *
 * [3895] Count Digit Appearances
 */

// @lc code=start
class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int n : nums) {
            while (n > 0) {
                int lastdigit = n % 10;
                n = n / 10;
                if (lastdigit == digit) {
                    count++;
                }
            }
        }
        return count;
    }
}
// @lc code=end

