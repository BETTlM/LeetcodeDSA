/*
 * @lc app=leetcode id=389 lang=java
 *
 * [389] Find the Difference
 */

// @lc code=start
class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;
        for (char c : s.toCharArray()) {
            result ^= c; 
        }
        for (char c : t.toCharArray()) {
            result ^= c;   
        }
        return result;
    }
}
// @lc code=end

