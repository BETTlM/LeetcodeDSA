/*
 * @lc app=leetcode id=2011 lang=java
 *
 * [2011] Final Value of Variable After Performing Operations
 */

// @lc code=start
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int val = 0;
        for (String s : operations) {
            val += (44 - s.charAt(1));
        }
        return val;
    }
}
// @lc code=end

