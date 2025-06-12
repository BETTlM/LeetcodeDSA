/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        s = s.toLowerCase();
        while (left < right) {
            int lchar = s.charAt(left);
            int rchar = s.charAt(right);
            if (! ((lchar >= (int) 'a' && lchar <= (int) 'z') || (lchar >= 48 && lchar <= 57))) {
                left += 1;
            }
            else if ((! ((rchar >= (int) 'a' && rchar <= (int) 'z') || (rchar >= 48 && rchar <= 57)))) {
                right -= 1;
            }
            else {
                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }
                else {
                    right -= 1;
                    left += 1;
                }
            }
        }
        return true;
    }
}
// @lc code=end

