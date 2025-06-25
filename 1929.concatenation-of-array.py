#
# @lc app=leetcode id=1929 lang=python
#
# [1929] Concatenation of Array
#

# @lc code=start
class Solution(object):
    def getConcatenation(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        nums.extend(nums)
        return nums
# @lc code=end

