/*
 * @lc app=leetcode id=3121 lang=java
 *
 * [3121] Count the Number of Special Characters II
 */

// @lc code=start
class Solution {
    public int numberOfSpecialChars(String word) {
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];
        int[] firstUpper = new int[26];
        int[] lastLower = new int[26];
        boolean[] foundFirstUpper = new boolean[26];
        int ind = 0;
        for (char c : word.toCharArray()) {
            int val = (int) c;
            if (val >= 97) {
                val -= 97;
                lastLower[val] = ind;
                lower[val] = true;
            }
            else {
                val -= 65;
                upper[val] = true;
                if (foundFirstUpper[val] == false) {
                    foundFirstUpper[val] = true;
                    firstUpper[val] = ind;
                }
            }
            ind++;
        }
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (lower[i] == true && upper[i] == true && lastLower[i] < firstUpper[i]) {
                count++;
            }
        }
        return count;
    }
}
// @lc code=end

