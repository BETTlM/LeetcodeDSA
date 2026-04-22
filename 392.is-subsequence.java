/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        int lens = s.length();
        int lent = t.length();
        int i = 0;
        int j = 0;
        if (lens == 0) {
            return true;
        }
        if (lent == 0) {
            return false;
        }
        while (j < lent) {
            if (i == lens) {
                return true;
            }
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            else {
                j++;
            }
        }
        return (i == lens);
    }
}
// @lc code=end

