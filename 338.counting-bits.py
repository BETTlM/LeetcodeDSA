#
# @lc app=leetcode id=338 lang=python
#
# [338] Counting Bits
#

# @lc code=start
class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        returnList = []
        for i in range(0,n+1):
            returnList.append(bin(i).count('1'))
        return returnList
# @lc code=end

