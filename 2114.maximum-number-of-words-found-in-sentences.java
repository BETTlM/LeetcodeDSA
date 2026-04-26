/*
 * @lc app=leetcode id=2114 lang=java
 *
 * [2114] Maximum Number of Words Found in Sentences
 */

// @lc code=start
class Solution {
    public int mostWordsFound(String[] sentences) {
        int i = 0;
    for (String s : sentences) {
      int count = 1;
      for (char c : s.toCharArray()) {
        if (c == ' ') {
          count++;
        }
        i = Math.max(i, count);
      }
    }
    return i;
    }
}
// @lc code=end

