/*
 * @lc app=leetcode id=2553 lang=java
 *
 * [2553] Separate the Digits in an Array
 */

// @lc code=start
class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> result = new ArrayList<>();
        for (int i : nums) {
            if (i < 10) {
                result.add(i);
            }
            else {
                List<Integer> temp = new ArrayList<>();
                while (i > 0) {
                    temp.add(i % 10);
                    i /= 10;
                }
                Collections.reverse(temp);
                result.addAll(temp);
            }
        }
        int[] ret = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }
}
// @lc code=end

