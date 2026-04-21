#
# @lc app=leetcode id=3783 lang=python
#
# [3783] Mirror Distance of an Integer
#

# @lc code=start
class Solution(object):
    def mirrorDistance(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 10:
            return 0
        else:
            original = n
            rev = 0
            while n > 0:
                digit = n % 10
                rev *= 10
                rev += digit
                n //= 10
            return abs(original - rev)
# @lc code=end

