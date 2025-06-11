#
# @lc app=leetcode id=231 lang=python
#
# [231] Power of Two
#

# @lc code=start
class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n < 0:
            return False
        num = bin(n)
        if num.count('1')==1:
            return True 
        return False
        
# @lc code=end

