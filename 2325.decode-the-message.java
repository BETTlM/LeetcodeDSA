/*
 * @lc app=leetcode id=2325 lang=java
 *
 * [2325] Decode the Message
 */

// @lc code=start
class Solution {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> keymap = new HashMap<>();
        char ind = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }
            if (!keymap.containsKey(key.charAt(i))) {
              keymap.put(key.charAt(i) , ind);
              ind++;
            }
        }
        keymap.put(' ', ' ');
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            if (keymap.containsKey(c)) {
                sb.append(keymap.get(c));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
// @lc code=end

