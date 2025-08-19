/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder title=new StringBuilder();
        while(columnNumber>0){
            columnNumber--;
            title.insert(0,(char)(columnNumber%26+'A'));
            columnNumber=columnNumber/26;
        }
        return title.toString();
    }
}
// @lc code=end

