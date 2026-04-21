/*
 * @lc app=leetcode id=3898 lang=java
 *
 * [3898] Find the Degree of Each Vertex
 */

// @lc code=start
class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    degree++;
                }
            }
            ans[i] = degree;
        }

        return ans;
    }
}
// @lc code=end

