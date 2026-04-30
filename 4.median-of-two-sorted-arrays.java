/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        int p1 = 0;
        int p2 = 0;
        int ind = 0;
        while (p1 < n1 && p2 < n2) {
            if (nums1[p1] > nums2[p2]) {
                merged[ind] = nums2[p2];
                p2++;
            }
            else {
                merged[ind] = nums1[p1];
                p1++;
            }
            ind++;
        }
        while (p1 < n1) {
            merged[ind] = nums1[p1];
            p1++;
            ind++;
        }
        while (p2 < n2) {
            merged[ind] = nums2[p2];
            p2++;
            ind++;
        }
        if ((n1 + n2) % 2 == 0) {
            return  ((double) merged[(n1+n2)/2] + merged[(n1+n2)/2 - 1])/2;
        }
        return merged[(n1+n2)/2];
    }
}
// @lc code=end

