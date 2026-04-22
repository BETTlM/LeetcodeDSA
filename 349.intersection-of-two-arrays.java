/*
 * @lc app=leetcode id=349 lang=java
 *
 * [349] Intersection of Two Arrays
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
         HashSet<Integer> intersection = new HashSet<>();
        for(int num : nums2){
            if (set1.contains(num)){
                intersection.add(num);
            }
        }
        int[] result = new int[intersection.size()];
        int count = 0;
        for (int num : intersection){
            result[count++] = num;
        }
        return result;
    }
}
// @lc code=end

