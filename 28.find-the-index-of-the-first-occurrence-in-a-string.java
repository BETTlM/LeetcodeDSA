/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution {
    public int strStr(String haystack, String needle) {
        try{
            return haystack.indexOf(needle);
        }
        catch (Exception e) {
            return -1;
        }
    }
}
// @lc code=end

