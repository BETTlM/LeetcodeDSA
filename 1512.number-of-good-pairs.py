#
# @lc app=leetcode id=1512 lang=python
#
# [1512] Number of Good Pairs
#

# @lc code=start
class Solution(object):
    def numIdenticalPairs(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for i in range(len(nums) - 1):
            for j in range(i + 1, len(nums)):
                if nums[i] == nums[j]:
                    count += 1
        return count
        
# @lc code=end

