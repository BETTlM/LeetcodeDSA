#
# @lc app=leetcode id=2413 lang=python
#
# [2413] Smallest Even Multiple
#

# @lc code=start
class Solution(object):
    def smallestEvenMultiple(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n%2 == 1:
            return n*2
        return n
        
# @lc code=end

