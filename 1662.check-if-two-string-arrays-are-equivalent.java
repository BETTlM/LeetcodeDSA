/*
 * @lc app=leetcode id=1662 lang=java
 *
 * [1662] Check If Two String Arrays are Equivalent
 */

// @lc code=start
class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (String s : word1) {
            sb1.append(s);
        }
        for (String s : word2) {
            sb2.append(s);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
// @lc code=end

