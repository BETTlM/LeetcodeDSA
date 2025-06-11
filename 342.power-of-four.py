#
# @lc app=leetcode id=342 lang=python
#
# [342] Power of Four
#

# @lc code=start
class Solution(object):
    def isPowerOfFour(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n >= 0 and (n & (n - 1) == 0) and (n%3 == 1):
            return True
        return False
        
# @lc code=end

