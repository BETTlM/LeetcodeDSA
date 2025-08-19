/*
 * @lc app=leetcode id=119 lang=java
 *
 * [119] Pascal's Triangle II
 */

// @lc code=start
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> arr = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                if(j==0 || i==j){
                    arr.add(1);
                }
                else {
                    int val = list.get(i-1).get(j-1) + list.get(i-1).get(j);
                    arr.add(val);
                }
            }
        list.add(arr);
       }
       return list.get(rowIndex);
    }
}
// @lc code=end

