#
# @lc app=leetcode id=1688 lang=python
#
# [1688] Count of Matches in Tournament
#

# @lc code=start
class Solution(object):
    def numberOfMatches(self, n):
        """
        :type n: int
        :rtype: int
        """
        matches = 0
        while n != 1:
            if n%2 == 1:
                matches += (n-1)//2
                n = (n - 1)//2 + 1
            else:
                matches += n//2
                n = n//2
        return matches
        
# @lc code=end

