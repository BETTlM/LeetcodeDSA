#
# @lc app=leetcode id=1480 lang=python
#
# [1480] Running Sum of 1d Array
#

# @lc code=start
class Solution(object):
    def runningSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        rs = []
        s = 0
        for i in nums:
            s += i
            rs.append(s)
        return rs
        
# @lc code=end

