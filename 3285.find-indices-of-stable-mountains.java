/*
 * @lc app=leetcode id=3285 lang=java
 *
 * [3285] Find Indices of Stable Mountains
 */

// @lc code=start
class Solution {
    public List<Integer> stableMountains(int[] height, int threshold) {
        ArrayList<Integer> r = new ArrayList<>();
        for (int i = 1; i < height.length; i++) {
            if (height[i-1] > threshold) {
                r.add(i);
            }
        }
        return r;
    }
}
// @lc code=end

