/*
 * @lc app=leetcode id=3550 lang=java
 *
 * [3550] Smallest Index With Digit Sum Equal to Index
 */

// @lc code=start
class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i<nums.length; i++) {
            if (i == sum(nums[i])) {
                return i;
            }
        }
        return -1;
    }
    
    public int sum(int x) {
        int sum = 0;
        while (x>0) {
            sum += x%10;
            x = x/10;
        }
        return sum;
    }

}
// @lc code=end

