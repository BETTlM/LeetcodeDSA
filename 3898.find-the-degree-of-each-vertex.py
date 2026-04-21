#
# @lc app=leetcode id=3898 lang=python
#
# [3898] Find the Degree of Each Vertex
#

# @lc code=start
class Solution(object):
    def findDegrees(self, matrix):
        """
        :type matrix: List[List[int]]
        :rtype: List[int]
        """
        return list(map(sum, matrix))
        
# @lc code=end

