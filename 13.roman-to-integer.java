/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */
import java.util.*;
// @lc code=start
class Solution {
    public int romanToInt(String s) {
            Map<Character, Integer> values = new HashMap<>();
    values.put('I', 1);
    values.put('V', 5);
    values.put('X', 10);
    values.put('L', 50);
    values.put('C', 100);
    values.put('D', 500);
    values.put('M', 1000);
    int result = 0;
    for (int i = 0; i <s.length(); i++) {
      if ( i == s.length() -1) {
        result += values.get(s.charAt(i));
      }
      else {
        if (values.get(s.charAt(i+1)) > values.get(s.charAt(i))){
          result -= values.get(s.charAt(i));
        }
        else {
          result += values.get(s.charAt(i));
        }
      }
    }
    return result;
    }
}
// @lc code=end

