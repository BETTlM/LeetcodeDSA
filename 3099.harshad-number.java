/*
 * @lc app=leetcode id=3099 lang=java
 *
 * [3099] Harshad Number
 */

// @lc code=start
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0;
        int og = x;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        if (og % s == 0) {
            return s;
        }
        return -1;
    }
}
// @lc code=end

