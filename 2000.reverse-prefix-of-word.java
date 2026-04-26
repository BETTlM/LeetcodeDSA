/*
 * @lc app=leetcode id=2000 lang=java
 *
 * [2000] Reverse Prefix of Word
 */

// @lc code=start
class Solution {
    public String reversePrefix(String word, char ch) {
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

