#
# @lc app=leetcode id=3895 lang=python
#
# [3895] Count Digit Appearances
#

# @lc code=start
class Solution(object):
    def countDigitOccurrences(self, nums, digit):
        """
        :type nums: List[int]
        :type digit: int
        :rtype: int
        """
        c = 0 
        for i in nums:
            while i > 0:
                d = i % 10
                i //= 10
                if d == digit:
                    c += 1
        return c
        
# @lc code=end

