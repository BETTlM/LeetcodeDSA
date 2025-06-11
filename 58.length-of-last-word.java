/*
 * @lc app=leetcode id=58 lang=java
 *
 * [58] Length of Last Word
 */

// @lc code=start
class Solution {
    public int lengthOfLastWord(String s) {
        boolean start = false;
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                start = true;
            }
            if (s.charAt(i) == ' ' && start) {
                break;
            }
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

