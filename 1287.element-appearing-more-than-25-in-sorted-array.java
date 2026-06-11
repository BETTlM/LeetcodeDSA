/*
 * @lc app=leetcode id=1287 lang=java
 *
 * [1287] Element Appearing More Than 25% In Sorted Array
 */

// @lc code=start
class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int limit = n / 4;
        for (int i = 0; i < n - limit; i++) {
            if (arr[i] == arr[i + limit]) {
                return arr[i];
            }
        }
        return -1;
    }
}
// @lc code=end

