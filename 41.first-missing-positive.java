/*
 * @lc app=leetcode id=41 lang=java
 *
 * [41] First Missing Positive
 */

// @lc code=start
class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();
        int firstMissingPositive = 1;
        for (int i : nums) {
            seen.add(i);
        }
        while (seen.contains(firstMissingPositive)) {
            firstMissingPositive++;
        }
        return firstMissingPositive;
    }
}
// @lc code=end

