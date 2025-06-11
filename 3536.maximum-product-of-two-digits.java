/*
 * @lc app=leetcode id=3536 lang=java
 *
 * [3536] Maximum Product of Two Digits
 */

// @lc code=start
class Solution {
    public int maxProduct(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        Arrays.sort(chars);
        int one = chars[chars.length - 1] - '0';
        int two = chars[chars.length - 2] - '0';
        return one * two;
    }
}
// @lc code=end

