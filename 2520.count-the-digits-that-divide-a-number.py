#
# @lc app=leetcode id=2520 lang=python
#
# [2520] Count the Digits That Divide a Number
#

# @lc code=start
class Solution(object):
    def countDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        c = 0
        og = num
        while num > 0:
            if og % (num % 10) == 0:
                c += 1
            num //= 10
        return c
# @lc code=end

