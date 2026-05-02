/*
 * @lc app=leetcode id=788 lang=java
 *
 * [788] Rotated Digits
 */

// @lc code=start
class Solution {
    public int rotatedDigits(int n) {
        int c = 0;
        for (int i = 1;  i <= n; i++) {
            boolean flip = false;
            boolean invalid = false;
            int num = i;
            while (num > 0) {
                int d = num % 10;
                if (d == 2 || d == 5 || d == 6 || d == 9) {
                    flip = true;
                }
                if (d == 3 || d == 4 || d == 7) {
                    invalid = true;
                    break;
                }
                num /= 10;
            }
            if (flip && !invalid) {
                c++;
            }
        }
    return c;
    }
}
// @lc code=end

