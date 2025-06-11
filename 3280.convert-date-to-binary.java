/*
 * @lc app=leetcode id=3280 lang=java
 *
 * [3280] Convert Date to Binary
 */

// @lc code=start
class Solution {
    public String convertDateToBinary(String date) {
        StringBuilder sb = new StringBuilder("");
        String year = Integer.toBinaryString(Integer.parseInt(date.substring(0,4)));
        String month = Integer.toBinaryString(Integer.parseInt(date.substring(5,7)));
        String dat = Integer.toBinaryString(Integer.parseInt(date.substring(8,10)));
        sb.append(year);
        sb.append("-");
        sb.append(month);
        sb.append("-");
        sb.append(dat);
        return sb.toString();
    }
}
// @lc code=end

