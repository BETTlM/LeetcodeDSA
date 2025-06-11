#
# @lc app=leetcode id=7 lang=python
#
# [7] Reverse Integer
#

# @lc code=start
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        negative = False
        if x<0:
            negative = True
        if negative:
            return -self.reverse((-1) * x)
        reversed = 0
        while x!=0:
            reversed = reversed*10 + x%10
            x = x//10
        if reversed >= 2**31:
            return 0
        return reversed
    
# @lc code=end

