/*
 * @lc app=leetcode id=88 lang=java
 *
 * [88] Merge Sorted Array
 */

// @lc code=start
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int j = 0; j < n; j++) {
            nums1[m+j] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
// @lc code=end

