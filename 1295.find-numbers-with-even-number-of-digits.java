/*
 * @lc app=leetcode id=1295 lang=java
 *
 * [1295] Find Numbers with Even Number of Digits
 */

// @lc code=start
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for (int i : nums) {
            if (i > 9 && i < 100) {
                c++;
            }
            else if(i > 999 && i < 10000) {
                c++;
            }
            else if(i == 100000){
                c++;
            }
        }
        return c;
    }
}
// @lc code=end

