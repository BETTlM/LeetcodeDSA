#
# @lc app=leetcode id=461 lang=python
#
# [461] Hamming Distance
#

# @lc code=start
class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        return bin(x ^ y).count('1')

# @lc code=end

