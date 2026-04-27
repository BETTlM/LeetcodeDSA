/*
 * @lc app=leetcode id=2535 lang=java
 *
 * [2535] Difference Between Element Sum and Digit Sum of an Array
 */

// @lc code=start
class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for (int i : nums) {
            elementSum += i;
            while (i > 0) {
                digitSum += i % 10;
                i /= 10;
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}
// @lc code=end

