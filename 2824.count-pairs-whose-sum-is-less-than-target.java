/*
 * @lc app=leetcode id=2824 lang=java
 *
 * [2824] Count Pairs Whose Sum is Less than Target
 */

// @lc code=start
class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int c = 0;
        for (int i = 0; i < nums.size() - 1; i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    c++;
                }
            }
        }   
        return c;
    }
}
// @lc code=end

