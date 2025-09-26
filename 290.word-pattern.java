/*
 * @lc app=leetcode id=290 lang=java
 *
 * [290] Word Pattern
 */

// @lc code=start
class Solution {
    public boolean wordPattern(String pattern, String s) {
        if (pattern.isEmpty() && s.isEmpty()) {
            return true;
        }
        if (pattern.isEmpty() || s.isEmpty()) {
            return false;
        }
        String[] words = s.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashSet<String> usedWords = new HashSet<>();
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];
            if (map.containsKey(c)) {
                if (!map.get(c).equals(word)) { 
                    return false;
                }
            } else {
                if (usedWords.contains(word)) { 
                    return false;
                }
                map.put(c, word);
                usedWords.add(word);
            }
        }
        return true;
    }
}

// @lc code=end

