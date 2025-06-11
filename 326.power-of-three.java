/*
 * @lc app=leetcode id=326 lang=java
 *
 * [326] Power of Three
 */

// @lc code=start
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n==0) {
            return false;
        }
        return n > 0 && 1162261467%n == 0;
    }
}
// @lc code=end

