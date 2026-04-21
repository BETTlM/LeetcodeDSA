#
# @lc app=leetcode id=1470 lang=python
#
# [1470] Shuffle the Array
#

# @lc code=start
class Solution(object):
    def shuffle(self, nums, n):
        """
        :type nums: List[int]
        :type n: int
        :rtype: List[int]
        """
        res = []
        for i, j in zip(nums[:n],nums[n:]):
            res += [i,j]
        return res
        
# @lc code=end

