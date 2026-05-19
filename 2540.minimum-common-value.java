/*
 * @lc app=leetcode id=2540 lang=java
 *
 * [2540] Minimum Common Value
 */

// @lc code=start
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (nums1[p1] == nums2[p2]) {
                return nums1[p1];
            }
            else if (nums1[p1] > nums2[p2]) {
                p2++;
            }
            else {
                p1++;
            }
        }
        return -1;
    }
}
// @lc code=end

