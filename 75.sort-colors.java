/*
 * @lc app=leetcode id=75 lang=java
 *
 * [75] Sort Colors
 */

// @lc code=start
class Solution {
    public void sortColors(int[] nums) {
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        for (int i : nums) {
            if (i == 0) {
                zeroCount++;
            }
            else if (i == 1) {
                oneCount++;
            }
            else {
                twoCount++;
            }
        }
        int index = 0;
        while (zeroCount != 0) {
            nums[index] = 0;
            zeroCount--;
            index++;
        }
        while (oneCount != 0) {
            nums[index] = 1;
            oneCount--;
            index++;
        }
        while (twoCount != 0) {
            nums[index] = 2;
            twoCount--;
            index++;
        }
    }
}
// @lc code=end

