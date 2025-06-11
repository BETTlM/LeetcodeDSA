/*
 * @lc app=leetcode id=2942 lang=java
 *
 * [2942] Find Words Containing Character
 */

// @lc code=start
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ret = new ArrayList<Integer>();
        for (int i = 0;i<words.length;i++) {
            if (words[i].contains(String.valueOf(x))) {
                ret.add(i);
            }
        }
        return ret;
    }
}
// @lc code=end

