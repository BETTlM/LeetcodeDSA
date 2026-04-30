/*
 * @lc app=leetcode id=2652 lang=java
 *
 * [2652] Sum Multiples
 */

// @lc code=start
class Solution {
    public int sumOfMultiples(int n) {
        if (n < 3) {
            return 0;
        }
        int s = 3;
        for (int i = 4; i < n + 1; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                s += i;
            }
        }
        return s;
    }
}
// @lc code=end

