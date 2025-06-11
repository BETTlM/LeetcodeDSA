#
# @lc app=leetcode id=507 lang=python
#
# [507] Perfect Number
#

# @lc code=start
class Solution(object):
    def checkPerfectNumber(self, num):
        """
        :type num: int
        :rtype: bool
        """
        if num == 1:
            return False
        factors = 1
        og = num
        for i in range(2,int(num**0.5)+ 1):
            if num%i == 0:
                factors += i
                if i*i != num:
                    factors += num//i
        if factors == og:
            return True
        else:
            return False
        
        
# @lc code=end

