/*
 * @lc app=leetcode id=1281 lang=java
 *
 * [1281] Subtract the Product and Sum of Digits of an Integer
 */

// @lc code=start
class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1;
        int su = 0;
        while (n > 0) {
            int digit = n % 10;
            prod *= digit;
            su += digit;
            n = n / 10;
        }
        return prod - su;
    }
}
// @lc code=end

