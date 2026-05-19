/*
 * @lc app=leetcode id=189 lang=java
 *
 * [189] Rotate Array
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length ;
        k = k % n;
        int[] ret = new int[n];
        int ind = 0;
        for (int i = k; i < n + k; i++) {
            ret[i % n] = nums[ind];
            ind++;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = ret[i];
        }
    }
}
// @lc code=end

