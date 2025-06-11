/*
 * @lc app=leetcode id=263 lang=java
 *
 * [263] Ugly Number
 */

// @lc code=start
class Solution {
    public boolean isUgly(int n) {
        if (n == 0) {
            return false;
        }
        for (int prime : new int[] {2,3,5}) {
            while (n%prime == 0) {
                n = n / prime;
            }
        }
        return (n == 1);
    }
}
// @lc code=end

