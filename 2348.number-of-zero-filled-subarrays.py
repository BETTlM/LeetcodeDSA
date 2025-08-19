#
# @lc app=leetcode id=2348 lang=python
#
# [2348] Number of Zero-Filled Subarrays
#

# @lc code=start
class Solution(object):
    def zeroFilledSubarray(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        window = 0
        for i in nums:
            if not i:
                window += 1
                count += window
            else:
                window = 0
        return count
        
# @lc code=end

