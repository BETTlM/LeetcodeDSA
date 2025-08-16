/*
 * @lc app=leetcode id=1323 lang=java
 *
 * [1323] Maximum 69 Number
 */

// @lc code=start
class Solution {
    public int maximum69Number (int num) {
        char[] idk = String.valueOf(num).toCharArray();
        for (int i = 0; i < idk.length; i++) {
            if (idk[i] == '6') {
                idk[i] = '9';
                break;
            }
        }
        return Integer.valueOf(new String(idk));
    }
}
// @lc code=end

