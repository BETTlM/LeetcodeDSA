/*
 * @lc app=leetcode id=2427 lang=java
 *
 * [2427] Number of Common Factors
 */

// @lc code=start
class Solution {
    public int commonFactors(int a, int b) {
        int c = 1;
        int m = Math.min(a,b);
        for (int i = 2; i <= m; i++) {
            if (a%i == 0 && b%i == 0) {
                c++;
            }
        }
        return c;
    }
}
// @lc code=end

