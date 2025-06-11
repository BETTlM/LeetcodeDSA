#
# @lc app=leetcode id=3536 lang=python
#
# [3536] Maximum Product of Two Digits
#

# @lc code=start
class Solution(object):
    def maxProduct(self, n):
        """
        :type n: int
        :rtype: int
        """
        if n < 100:
            return (n%10) * (n//10)
        l = list(str(n))
        l.sort()
        return int(l[-1]) * int(l[-2])
        
# @lc code=end

