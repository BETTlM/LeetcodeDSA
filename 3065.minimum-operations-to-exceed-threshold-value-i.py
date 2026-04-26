#
# @lc app=leetcode id=3065 lang=python
#
# [3065] Minimum Operations to Exceed Threshold Value I
#

# @lc code=start
class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        c = 0
        for i in nums:
            if i < k:
                c += 1
        return c
        
# @lc code=end

