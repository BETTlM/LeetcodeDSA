/*
 * @lc app=leetcode id=2220 lang=java
 *
 * [2220] Minimum Bit Flips to Convert Number
 */

// @lc code=start
class Solution {
    public int minBitFlips(int start, int goal) {
        int ans = 0; 
        int xor = start ^ goal;
        while(xor!=0){
            ans += xor & 1;
            xor >>=1;
        }
        return ans;
    }
}
// @lc code=end

