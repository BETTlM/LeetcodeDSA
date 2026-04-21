/*
 * @lc app=leetcode id=3541 lang=java
 *
 * [3541] Find Most Frequent Vowel and Consonant
 */

// @lc code=start
class Solution {
    public int maxFreqSum(String s) {
        HashSet<Character> vowel = new HashSet<>();
    vowel.add('a'); vowel.add('e'); vowel.add('i'); vowel.add('o'); vowel.add('u');
    HashMap<Character, Integer> v = new HashMap<>();
    HashMap<Character, Integer> co = new HashMap<>();
    for (char c : s.toCharArray()) {
      if (vowel.contains(c)) {
        if (v.containsKey(c)) {
          v.put(c, v.get(c) + 1);
        }
        else {
          v.put(c, 1);
        }
      }
      else {
        if (co.containsKey(c)) {
          co.put(c, co.get(c) + 1);
        }
        else {
          co.put(c, 1);
        }
      }
    }
    ArrayList<Integer> vvals = new ArrayList<>(v.values());
    ArrayList<Integer> cvals = new ArrayList<>(co.values());
    if (vvals.isEmpty()) {
      return Collections.max(cvals);
    }
    else if (cvals.isEmpty()) {
      return Collections.max(vvals);
    }
    else {
      return Collections.max(vvals) + Collections.max(cvals);
    }
    }
}
// @lc code=end

