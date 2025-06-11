/*
 * @lc app=leetcode id=171 lang=java
 *
 * [171] Excel Sheet Column Number
 */

// @lc code=start
class Solution {
    public int titleToNumber(String columnTitle) {
        int row = 0;
        int power = 0;
        for (int i = columnTitle.length() -1 ; i >= 0; i--) {
            int letter = columnTitle.charAt(i) - 'A' + 1;
            int value = (int) Math.pow(26,power) * letter;
            power++;
            row += value;
        }
        return row; 
    }
}
// @lc code=end

