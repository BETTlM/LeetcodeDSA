/*
 * @lc app=leetcode id=3005 lang=java
 *
 * [3005] Count Elements With Maximum Frequency
 */

// @lc code=start
class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> count = new HashMap<>();
        int max = 0;
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
            max= Math.max(max, count.get(i));
        }
        int c = 0;
        for (int i : count.keySet()) {
            if (count.get(i) == max) {
                c+= max;
            }
        }
        return c;
    }
}
// @lc code=end

