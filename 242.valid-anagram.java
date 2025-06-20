/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] his = new int[26];
        if (s.length() != t.length()) {
          return false;
        }
        for(int i = 0; i<s.length(); i++) {
            int sc = s.charAt(i) - 'a';
            int tc = t.charAt(i) - 'a';
            his[sc]++;
            his[tc]--;
        }
        for (int i : his) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }
}
// @lc code=end

