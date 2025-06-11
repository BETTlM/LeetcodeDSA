/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int term1 = 0;
            int term2 = 1;
            int term3 = 1;
            while (n != 1) {
                n--;
                term3 = term1 + term2;
                term1 = term2;
                term2 = term3;
            }
            return term3;
        }
    }
}
// @lc code=end

