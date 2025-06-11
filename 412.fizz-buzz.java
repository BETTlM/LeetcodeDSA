/*
 * @lc app=leetcode id=412 lang=java
 *
 * [412] Fizz Buzz
 */

// @lc code=start
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> returnArray = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
        if (i%15==0) {
            returnArray.add("FizzBuzz");
        }
        else if (i%5 == 0) {
            returnArray.add("Buzz");
        }
        else if (i%3 == 0) {
            returnArray.add("Fizz");
        }
        else {
            returnArray.add(Integer.toString(i));
        }
        }
        return returnArray;            
    }
}
// @lc code=end

