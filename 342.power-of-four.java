/*
 * @lc app=leetcode id=342 lang=java
 *
 * [342] Power of Four
 */

// @lc code=start
class Solution {
    public boolean isPowerOfFour(int n) {
        if (n>=0 && ((n & n-1) == 0) && (n%3 == 1)) {
            return true;
        }
            return false;
        }       
    }
// @lc code=end

