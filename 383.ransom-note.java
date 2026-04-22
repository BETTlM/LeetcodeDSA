/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mag = new int[26];
        for (char c : magazine.toCharArray()) {
      mag[c - 'a']++;
    }
    for (char c : ransomNote.toCharArray()) {
      mag[c - 'a']--;
    }
    for (int i : mag) {
      if (i < 0) {
        return false;
      }
    }
    return true;
    }
}
// @lc code=end

