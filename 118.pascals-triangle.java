/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        for (int i = 0; i<numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j<=i; j++) {
                row.add(1);
            }
        output.add(row);
        }

        for (int i = 2; i < numRows; i++) {
            List<Integer> prevRow = output.get(i - 1);
            List<Integer> currRow = output.get(i);
            for (int j = 1; j < currRow.size() - 1; j++) {
                currRow.set(j, prevRow.get(j - 1) + prevRow.get(j));
            }
        }
        return output;
    }
}
// @lc code=end

