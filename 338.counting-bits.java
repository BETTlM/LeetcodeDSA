/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int[] returnArray = new int[n+1];
        for (int i = 0; i<=n;i++) {
            int count = 0;
            for (char a : Integer.toBinaryString(i).toCharArray()) {
                if (a == '1') {
                    count++;
                }
            }
            returnArray[i] = count;
        }
        return returnArray;
    }
}
// @lc code=end

