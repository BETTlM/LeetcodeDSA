/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution {
    public int numIslands(char[][] grid) {
        char[] ca = word.toCharArray();
    int n = ca.length;
    int i = 0;
    int j = 0;
    while (j < n) {
      if (ca[j] == ch) {
        break;
      }
      j++;
    }
    if (j != n) {
      while (i < j) {
        char t = ca[i];
        ca[i] = ca[j];
        ca[j] = t;
        i++;
        j--;
      }
    }
    return new String(ca);
    }
}
// @lc code=end

