#
# @lc app=leetcode id=3701 lang=python
#
# [3701] Compute Alternating Sum
#

# @lc code=start
class Solution(object):
    def alternatingSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result = 0
        for i in range(len(nums)):
            if (i % 2):
                result -= nums[i]
            else:
                result += nums[i]
        return result
        
# @lc code=end

