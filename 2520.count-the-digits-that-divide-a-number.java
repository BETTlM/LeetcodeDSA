/*
 * @lc app=leetcode id=2520 lang=java
 *
 * [2520] Count the Digits That Divide a Number
 */

// @lc code=start
class Solution {
    public int countDigits(int num) {
        int c = 0;
        int og = num;
        while (num > 0) {
            if (og % (num % 10) == 0) {
                c++;
            }
            num /= 10;
        }
        return c;
    }
}
// @lc code=end

