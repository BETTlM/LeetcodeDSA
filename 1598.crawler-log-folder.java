/*
 * @lc app=leetcode id=1598 lang=java
 *
 * [1598] Crawler Log Folder
 */

// @lc code=start
class Solution {
    public int minOperations(String[] logs) {
        int depth = 0;
        for (String s : logs) {
            if (s.equals("./")) {
                continue;
            }
            else if (s.equals("../")) {
                if (depth > 0) {
                    depth--;
                }
            }
            else {
                depth++;
            }
        }
    return depth;
    }
}
// @lc code=end

