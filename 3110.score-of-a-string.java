/*
 * @lc app=leetcode id=3110 lang=java
 *
 * [3110] Score of a String
 */

// @lc code=start
class Solution {
    public int scoreOfString(String s) {
        int score = 0;
        for (int i = 0; i<s.length() - 1; i++) {
            int a = s.charAt(i) - s.charAt(i+1);
            score += Math.abs(a);
        }
        return score;
    }
}
// @lc code=end

