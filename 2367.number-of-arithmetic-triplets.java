/*
 * @lc app=leetcode id=2367 lang=java
 *
 * [2367] Number of Arithmetic Triplets
 */

// @lc code=start
class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int counter = 0;
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        for (int num : nums) {
            if (numSet.contains(num + diff) && numSet.contains(num + 2 * diff)) {
                counter++;
            }
        }
        return counter;
    }
}
// @lc code=end

