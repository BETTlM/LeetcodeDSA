/*
 * @lc app=leetcode id=1816 lang=java
 *
 * [1816] Truncate Sentence
 */

// @lc code=start
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int co = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                co++;
            }
            if (co == k) {
                break;
            }
            sb.append(c);
        }
        return sb.toString();
    }
}
// @lc code=end

