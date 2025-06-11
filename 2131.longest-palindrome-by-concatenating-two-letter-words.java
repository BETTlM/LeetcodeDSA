/*
 * @lc app=leetcode id=2131 lang=java
 *
 * [2131] Longest Palindrome by Concatenating Two Letter Words
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String[] words) {
        Set<String> visited = new HashSet<>();
        Map<String, Integer> count = new HashMap<>();
        for (String word : words) {
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        int ans = 0;
        boolean flag = true;
        for (Map.Entry<String, Integer> entry : count.entrySet()) {
            String s = entry.getKey();
            int cnt = entry.getValue();
            if (visited.contains(s)) {
                continue;
            }
            if (s.charAt(0) == s.charAt(1)) {
                if (cnt % 2 == 1) {
                    cnt -= 1;
                    if (flag) {
                        ans += 2;
                        flag = false;
                    }
                }
                ans += cnt * 2;
                continue;
            }
            String ss = "" + s.charAt(1) + s.charAt(0);
            int maxAdd = Math.min(cnt, count.getOrDefault(ss, 0));
            ans += (maxAdd * 2) * 2;

            visited.add(s);
            visited.add(ss);
        }    
        return ans;
 
    }
}
// @lc code=end

