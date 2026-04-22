#
# @lc app=leetcode id=190 lang=python
#
# [190] Reverse Bits
#

# @lc code=start
class Solution(object):
    def reverseBits(self, n):
        """
        :type n: int
        :rtype: int
        """
        res = 0
        for i in range(32):
            res = (res << 1) | (n & 1)
            n >>= 1
        return res

        
# @lc code=end

