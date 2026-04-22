/*
 * @lc app=leetcode id=409 lang=java
 *
 * [409] Longest Palindrome
 */

// @lc code=start
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        int size = 0;
        boolean hasodd = false;
        for (int i : hm.values()) {
            if (i % 2 == 0) {
                size += i;
            }
            else {
                size += i - 1;
                hasodd = true;
            }
        }
        if (hasodd) {
            size++;
        }
        return size;
    }
}
// @lc code=end

