#
# @lc app=leetcode id=3300 lang=python
#
# [3300] Minimum Element After Replacement With Digit Sum
#

# @lc code=start
class Solution(object):
    def minElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        mins = float('inf')
        for i in nums:
            s = 0
            while i > 0:
                s += i % 10
                i //= 10
            mins = min(s, mins)
        return mins

        
# @lc code=end

