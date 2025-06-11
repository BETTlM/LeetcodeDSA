#
# @lc app=leetcode id=3516 lang=python
#
# [3516] Find Closest Person
#

# @lc code=start
class Solution(object):
    def findClosest(self, x, y, z):
        """
        :type x: int
        :type y: int
        :type z: int
        :rtype: int
        """
        if abs(x - z) == abs(y - z):
            return 0
        elif abs(x - z)<abs(y - z):
            return 1
        else:
            return 2
        
        
# @lc code=end

