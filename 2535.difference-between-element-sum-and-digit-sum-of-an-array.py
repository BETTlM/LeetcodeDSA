#
# @lc app=leetcode id=2535 lang=python
#
# [2535] Difference Between Element Sum and Digit Sum of an Array
#

# @lc code=start
class Solution(object):
    def differenceOfSum(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        es = 0
        ds = 0
        for i in nums:
            es += i
            while i > 0:
                ds += i % 10
                i //= 10
        return abs(es - ds)
# @lc code=end

