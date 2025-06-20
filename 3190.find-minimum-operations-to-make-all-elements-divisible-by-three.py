#
# @lc app=leetcode id=3190 lang=python
#
# [3190] Find Minimum Operations to Make All Elements Divisible by Three
#

# @lc code=start
class Solution(object):
    def minimumOperations(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        for i in nums:
            if i%3 != 0:
                count += 1
        return count
         
# @lc code=end

