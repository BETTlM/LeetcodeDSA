/*
 * @lc app=leetcode id=3516 lang=java
 *
 * [3516] Find Closest Person
 */

// @lc code=start
class Solution {
    public int findClosest(int x, int y, int z) {
        int d1 = Math.abs(x-z);
        int d2 = Math.abs(y-z);
        if (d1>d2) {
            return 2;
        }
        else if(d2>d1) {
            return 1;
        }
        else {
            return 0;
        }
    }
}
// @lc code=end

