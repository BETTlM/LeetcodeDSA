#
# @lc app=leetcode id=1281 lang=python
#
# [1281] Subtract the Product and Sum of Digits of an Integer
#

# @lc code=start
class Solution(object):
    def subtractProductAndSum(self, n):
        """
        :type n: int
        :rtype: int
        """
        prod = 1
        su = 1
        while n > 0:
            d = n % 10
            prod *= d
            su += d
            n //= 10
        return prod - su + 1
        
# @lc code=end

