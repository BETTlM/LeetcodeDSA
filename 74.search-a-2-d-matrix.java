/*
 * @lc app=leetcode id=74 lang=java
 *
 * [74] Search a 2D Matrix
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int[] row : matrix) {
            for (int i : row) {
                if (target == i) {
                    return true;
                }
            }
        }
        return false;
    }
}
// @lc code=end

