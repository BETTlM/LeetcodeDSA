#
# @lc app=leetcode id=202 lang=python
#
# [202] Happy Number
#

# @lc code=start
class Solution(object):
    def isHappy(self, n):
        """
        :type n: int
        :rtype: bool
        """
        history = set()
        while n!= 1:
            history.add(n)
            sum = 0
            while (n>0):
                sum += (n%10)**2
                n = n//10
            if sum in history:
                return False 
            else:
                history.add(sum)
                n = sum
        return True
        
        
# @lc code=end

