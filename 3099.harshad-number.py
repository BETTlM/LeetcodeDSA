#
# @lc app=leetcode id=3099 lang=python
#
# [3099] Harshad Number
#

# @lc code=start
class Solution(object):
    def sumOfTheDigitsOfHarshadNumber(self, x):
        """
        :type x: int
        :rtype: int
        """
        s = 0
        og = x
        while x > 0:
            s += x % 10
            x //= 10
        if og % s == 0:
            return s
        return -1
        
# @lc code=end

