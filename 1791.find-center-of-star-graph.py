#
# @lc app=leetcode id=1791 lang=python
#
# [1791] Find Center of Star Graph
#

# @lc code=start
class Solution(object):
    def findCenter(self, edges):
        """
        :type edges: List[List[int]]
        :rtype: int
        """
        a, b = edges[0]
        c, d = edges[1]

        if a == c or a == d:
            return a
        return b
        
# @lc code=end

