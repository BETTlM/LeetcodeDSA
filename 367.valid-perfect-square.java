/*
 * @lc app=leetcode id=367 lang=java
 *
 * [367] Valid Perfect Square
 */

// @lc code=start
class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 0;
        long right = num;
        while (left <= right) {
            long mid = (left + right)/2;
            if (mid * mid == num) {
                return true;
            }
            else if(mid*mid < num) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        return false;        
    }
}
// @lc code=end

