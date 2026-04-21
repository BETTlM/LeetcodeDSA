/*
 * @lc app=leetcode id=3498 lang=java
 *
 * [3498] Reverse Degree of a String
 */

// @lc code=start
class Solution {
    public int reverseDegree(String s) {
    int res = 0;
    char[] ch = s.toCharArray();
    for (int i = 0; i < ch.length; i++) {
        res += (i+1) * (26 - (ch[i] - 'a'));
    }
    return res;
        
    }
}

// @lc code=end

