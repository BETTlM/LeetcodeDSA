/*
 * @lc app=leetcode id=3120 lang=java
 *
 * [3120] Count the Number of Special Characters I
 */

// @lc code=start
class Solution {
    public int numberOfSpecialChars(String word) {
        int counter = 0;
        int[] small = new int[26];
        int[] big = new int[26];
        for (char c : word.toCharArray()) {
            int value = (int) c;
            if (value >= 97) {
                small[value - 97]++;
            }
            else {
                big[value - 65]++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (small[i] > 0 && big[i] > 0) {
                counter++;
            }
        }
        return counter;
    }
}
// @lc code=end

