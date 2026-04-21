/*
 * @lc app=leetcode id=3783 lang=java
 *
 * [3783] Mirror Distance of an Integer
 */

// @lc code=start
class Solution {
    public int mirrorDistance(int n) {
        int rev = 0;
        int original = n;
        if (n < 10) {
            return 0;   
        }
        else {
        while (n > 0) {
            int digit = n % 10;
            rev *= 10;
            rev += digit;
            n = n /10;
        }
        }
        return Math.abs(rev - original);
    }
}
// @lc code=end

