/*
 * @lc app=leetcode id=3668 lang=java
 *
 * [3668] Restore Finishing Order
 */

// @lc code=start

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> friend = new HashSet<>();
        for (int i : friends) {
            friend.add(i);
        }
        List<Integer> result = new ArrayList<>();
        for (int i : order) {
            if (friend.contains(i)) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
// @lc code=end

