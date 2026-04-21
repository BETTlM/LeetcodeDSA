/*
 * @lc app=leetcode id=771 lang=java
 *
 * [771] Jewels and Stones
 */

// @lc code=start
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
            HashSet<Character> jewel = new HashSet<>();
    for (char c : jewels.toCharArray()) {
      jewel.add(c);
    }
    int count = 0;
    for (char s : stones.toCharArray()) {
      if (jewel.contains(s)) {
        count++;
      }
    }
    return count;
    }
}
// @lc code=end

