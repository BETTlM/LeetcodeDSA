/*
 * @lc app=leetcode id=1665 lang=java
 *
 * [1665] Minimum Initial Energy to Finish Tasks
 */

// @lc code=start
class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (b[1] - b[0]) - (a[1] - a[0]));

        int curr = 0;
        int ans  = 0;
        for (int[] task : tasks) {
            int actual  = task[0];
            int minimum = task[1];
            if (curr < minimum) {
                ans  += (minimum - curr);
                curr  = minimum;
            }
            curr -= actual;
        }
        return ans;
    }
}
// @lc code=end

