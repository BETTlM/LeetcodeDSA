/*
 * @lc app=leetcode id=2710 lang=java
 *
 * [2710] Remove Trailing Zeros From a String
 */

// @lc code=start
class Solution {
    public String removeTrailingZeros(String num) {
        int n = num.length();
        while(num.charAt(n-1) == '0') {
            n--;
        }
        return num.substring(0,n);
    }
}
// @lc code=end

