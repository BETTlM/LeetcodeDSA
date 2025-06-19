#
# @lc app=leetcode id=633 lang=python
#
# [633] Sum of Square Numbers
#

# @lc code=start
class Solution(object):
    def judgeSquareSum(self, c):
        """
        :type c: int
        :rtype: bool
        """
        left = 0
        right = int(c**0.5)
        while left <= right:
            if c == left**2 + right**2:
                return True
            elif c < left**2 + right**2:
                right -= 1
            else:
                left += 1
        return False
        
# @lc code=end

