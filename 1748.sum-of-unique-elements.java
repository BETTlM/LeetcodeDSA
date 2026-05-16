/*
 * @lc app=leetcode id=1748 lang=java
 *
 * [1748] Sum of Unique Elements
 */

// @lc code=start
class Solution {
    public int sumOfUnique(int[] nums) {
     HashMap<Integer,Integer> counter = new HashMap<>();
        for (int i : nums) {
            counter.put(i, counter.getOrDefault(i, 0) + 1);
        }
        int s = 0;
        for (int i : counter.keySet()) {
            if (counter.get(i) == 1) {
                s += i;
            }
        }
        return s;   
    }
}
// @lc code=end

