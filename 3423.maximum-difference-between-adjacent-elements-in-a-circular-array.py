#
# @lc app=leetcode id=3423 lang=python
#
# [3423] Maximum Difference Between Adjacent Elements in a Circular Array
#

# @lc code=start
class Solution(object):
    def maxAdjacentDistance(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        maxDiff = 0
        for i in range(len(nums)):
            diff = abs(nums[i] - nums[(i+1)%len(nums)])
            if diff > maxDiff:
                maxDiff = diff
        return maxDiff
        
# @lc code=end

