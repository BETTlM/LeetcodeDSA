#
# @lc app=leetcode id=70 lang=python
#
# [70] Climbing Stairs
#

# @lc code=start
class Solution(object):
    def climbStairs(self, n):
        """
        :type n: int
        :rtype: int
        """
        if (n <= 3):
            return n
        
        prev1 = 3
        prev2 = 2
        cur = 0
        for i in range(3,n):
            cur = prev1 + prev2
            prev2 = prev1
            prev1 = cur
        return cur
# @lc code=end

