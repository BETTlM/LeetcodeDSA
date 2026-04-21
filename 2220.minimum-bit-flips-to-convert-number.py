#
# @lc app=leetcode id=2220 lang=python
#
# [2220] Minimum Bit Flips to Convert Number
#

# @lc code=start
class Solution(object):
    def minBitFlips(self, start, goal):
        """
        :type start: int
        :type goal: int
        :rtype: int
        """
        ans = 0 
        xor = start ^ goal
        while xor != 0:
            ans += xor & 1
            xor >>= 1
        return ans
# @lc code=end

