#
# @lc app=leetcode id=2894 lang=python
#
# [2894] Divisible and Non-divisible Sums Difference
#

# @lc code=start
class Solution(object):
    def differenceOfSums(self, n, m):
        """
        :type n: int
        :type m: int
        :rtype: int
        """
        num1 = 0
        num2 = 0
        for i in range(1,n+1):
            if i%m == 0:
                num2 += i
            else:
                num1 += i
        return num1 - num2
# @lc code=end

