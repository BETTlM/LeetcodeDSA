/*
 * @lc app=leetcode id=1684 lang=java
 *
 * [1684] Count the Number of Consistent Strings
 */

// @lc code=start
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
     HashSet<Character> allw = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            allw.add(c);
        }
        int count = 0;
        for (String s : words) {
            for (char c : s.toCharArray()) {
                if (!allw.contains(c)) {
                    count++;
                    break;
                }
            }
        }
        return words.length - count;   
    }
}
// @lc code=end

