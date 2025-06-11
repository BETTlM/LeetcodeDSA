#
# @lc app=leetcode id=509 lang=python
#
# [509] Fibonacci Number
#

# @lc code=start
class Solution(object):
    def fib(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n == 0:
            return 0
        elif n == 1:
            return 1
        else:
            term1 = 0
            term2 = 1
            while n != 1:
                n -= 1
                term3 = term1+term2
                term1 = term2
                term2 = term3
            return term3
        
# @lc code=end

