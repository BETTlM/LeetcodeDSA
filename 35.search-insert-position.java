/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start
class Solution {
    public int searchInsert(int[] nums, int target) {
        try {
            for (int i = 0; i<nums.length; i++) {
                if (nums[i] == target) {
                    return i;
                }
            }
            throw new Exception();
        }
        catch (Exception e) {
            if (nums[0] > target) {
                return 0;
            }
            else if (nums[nums.length - 1]< target) {
                return nums.length;
            }
            else {
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i]>=target && nums[i-1] <= target) {
                        return i;
                    }
                }
            }
        }
        return 0;
    }
}
// @lc code=end

