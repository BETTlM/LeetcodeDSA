#
# @lc app=leetcode id=3467 lang=python
#
# [3467] Transform Array by Parity
#

# @lc code=start
class Solution(object):
    def transformArray(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        even = odd = 0
        for i in nums:
            if i % 2:
                odd += 1
            else:
               even += 1
        result = [0] * (even)
        for i in range(odd):
            result.append(1)
        return result        
        
# @lc code=end

