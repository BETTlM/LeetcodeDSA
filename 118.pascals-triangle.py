#
# @lc app=leetcode id=118 lang=python
#
# [118] Pascal's Triangle
#

# @lc code=start
class Solution(object):
    def generate(self, numRows):
        """
        :type numRows: int
        :rtype: List[List[int]]
        """
        output = []
        for i in range(numRows):
            output.append([1] * (i + 1))
        for i in range(2, numRows):
            for j in range(1, len(output[i]) - 1):
                output[i][j] = output[i - 1][j - 1] + output[i - 1][j]
        return output
        
# @lc code=end

