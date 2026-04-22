/*
 * @lc app=leetcode id=345 lang=java
 *
 * [345] Reverse Vowels of a String
 */

// @lc code=start
class Solution {
    public String reverseVowels(String s) {
        char[] c = s.toCharArray();
        int l = c.length;
        int left = 0;
        int right = l - 1;
        HashSet<Character> vowel = new HashSet<>();
        for (char a : "aeiouAEIOU".toCharArray()) {
            vowel.add(a);
        }
        while (left <= right) {
            if (!vowel.contains(c[left])) {
                left++;
            }
            else if (!vowel.contains(c[right])) {
                right--;
            }
            else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        return new String(c);
    }
}
// @lc code=end

