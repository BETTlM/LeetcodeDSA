/*
 * @lc app=leetcode id=2413 lang=java
 *
 * [2413] Smallest Even Multiple
 */

// @lc code=start
class Solution {
    public int smallestEvenMultiple(int n) {
        if (n%2 == 1) {
            return n*2;
        }
        return n;
    }
}
// @lc code=end

