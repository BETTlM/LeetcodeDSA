/*
 * @lc app=leetcode id=1347 lang=java
 *
 * [1347] Minimum Number of Steps to Make Two Strings Anagram
 */

// @lc code=start
class Solution {
    public int minSteps(String s, String t) {
        int[] sa = new int[26];
        for (char c : s.toCharArray()){ 
            sa[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            sa[c - 'a']--;
        }
        int su = 0;
        for (int i : sa) {
            su += Math.abs(i);
        }
        return su/2;
    }
}
// @lc code=end

