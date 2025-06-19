/*
 * @lc app=leetcode id=633 lang=java
 *
 * [633] Sum of Square Numbers
 */

// @lc code=start
class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0;
        long right = (long) Math.sqrt(c);
        while (left <= right) {
            if (c == left*left + right*right) {
                return true;
            }
            else if(c < left*left + right*right) {
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
}
// @lc code=end

