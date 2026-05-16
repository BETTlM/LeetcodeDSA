/*
 * @lc app=leetcode id=2784 lang=java
 *
 * [2784] Check if Array is Good
 */

// @lc code=start
class Solution {
    public boolean isGood(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            counter.put(i, counter.getOrDefault(i,0) + 1);
        }
        for (int i = 1; i < nums.length; i++) {
            if (!counter.containsKey(i)) {
                return false;
            }
            if (max == i) {
                if (counter.get(i) != 2) {
                    return false;
                }
            }
            else {
                if (counter.get(i) != 1) {
                    return false;
                }
            }
        }
        if (counter.get(max) != 2) {
            return false;
        }
        return true;
    }
}
// @lc code=end

