/*
 * @lc app=leetcode id=3024 lang=java
 *
 * [3024] Type of Triangle
 */

// @lc code=start
class Solution {
    public String triangleType(int[] nums) {
        boolean flag = true;
        for (int i = 0; i<3; i++) {
            if (nums[i] >= nums[(i + 1)%3] + nums[(i + 2)%3]) {
                flag = false;
            }
        }
        if (!flag) {
        return "none";
        }
        ArrayList<Integer> set = new ArrayList<>();
        for (int i : nums) {
        if (set.contains(i)) {
            continue;
        }
        else {
            set.add(i);
        }
        }
        if (set.size()==3) {
        return "scalene";
        }
        else if(set.size() == 2) {
        return "isosceles";
        }
        else {
        return "equilateral";
        }
    }
}
// @lc code=end

