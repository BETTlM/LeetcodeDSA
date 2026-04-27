#
# @lc app=leetcode id=3736 lang=python
#
# [3736] Minimum Moves to Equal Array Elements III
#

# @lc code=start
class Solution(object):
    def minMoves(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        m = - float('inf')
        s = 0
        for i in nums:
            s += i 
            m = max(m,i)
        return m*len(nums) - s
        
# @lc code=end

