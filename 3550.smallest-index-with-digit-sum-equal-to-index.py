#
# @lc app=leetcode id=3550 lang=python
#
# [3550] Smallest Index With Digit Sum Equal to Index
#

# @lc code=start
class Solution(object):
    def smallestIndex(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def sumOfDigits(x):
            s = 0
            while x>0:
                s += x%10
                x = x//10
            return s
        for i in range(len(nums)):
            if i == sumOfDigits(nums[i]):
                return i
        return -1
        
# @lc code=end

