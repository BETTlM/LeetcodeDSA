/*
 * @lc app=leetcode id=2138 lang=java
 *
 * [2138] Divide a String Into Groups of Size k
 */

// @lc code=start
class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = s.length();
        int groups = (n + k - 1) / k;
        String[] result = new String[groups];
        
        for (int i = 0; i < groups; i++) {
            StringBuilder group = new StringBuilder();
            for (int j = 0; j < k; j++) {
                int index = i * k + j;
                if (index < n) {
                    group.append(s.charAt(index));
                } else {
                    group.append(fill);
                }
            }
            result[i] = group.toString();
        }
        
        return result;
    }
}
// @lc code=end

