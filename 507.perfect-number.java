/*
 * @lc app=leetcode id=507 lang=java
 *
 * [507] Perfect Number
 */

// @lc code=start
class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) {
            return false;
        }
        long sum = 1;
        for (int i = 2; i<= Math.sqrt(num); i++) {
            if (num % i == 0) {
                sum += i;
                if (i * i != num) {
                sum += num/i;
                }
            }
        }
        if (num == sum) {
        return true;
        }
        return false;
    }
}
// @lc code=end

