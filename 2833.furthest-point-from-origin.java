/*
 * @lc app=leetcode id=2833 lang=java
 *
 * [2833] Furthest Point From Origin
 */

// @lc code=start
class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int a = 0;
    int b = 0;
    for (char c : moves.toCharArray()) {
      if (c == 'L') {
        a++;
      }
      else if (c == 'R') {
        a--;
      }
      else {
        b++;
      }
    }
    return Math.abs(a) + b;
    }
}
// @lc code=end

