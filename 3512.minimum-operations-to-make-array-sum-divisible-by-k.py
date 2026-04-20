#
# @lc app=leetcode id=3512 lang=python
#
# [3512] Minimum Operations to Make Array Sum Divisible by K
#

# @lc code=start
class Solution(object):
    def minOperations(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        sums = 0
        for i in nums:
            sums += i
        return sums % k
        
# @lc code=end

