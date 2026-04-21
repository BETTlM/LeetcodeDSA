/*
 * @lc app=leetcode id=3760 lang=java
 *
 * [3760] Maximum Substrings With Distinct Start
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int maxDistinct(String s) {
        HashSet<Character> st = new HashSet<>();
        for (char c : s.toCharArray()) {
            st.add(c);
        }
        return st.size();
    }
}
// @lc code=end

