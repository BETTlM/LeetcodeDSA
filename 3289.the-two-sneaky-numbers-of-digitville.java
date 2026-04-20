/*
 * @lc app=leetcode id=3289 lang=java
 *
 * [3289] The Two Sneaky Numbers of Digitville
 */

// @lc code=start
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            if (hm.containsKey(i)) {
                hm.put(i, hm.get(i) + 1);
            }
            else {
                hm.put(i, 1);
            }
        }
        int[] result = new int[2];
        int index = 0;
        for (int i : hm.keySet()) {
            if (hm.get(i) == 2) {
                result[index] = i;
                index++;
            }
            if (index == 2) {
                break;
            }
        }
        return result;
    }
}
// @lc code=end

