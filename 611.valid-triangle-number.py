#
# @lc app=leetcode id=611 lang=python
#
# [611] Valid Triangle Number
#

# @lc code=start
class Solution(object):
    def triangleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n = len(nums)
        count = 0
        for i in range(n - 1, 1, -1):
            left = 0
            right = i - 1
            while left < right:
                if(nums[left] + nums[right] > nums[i]):
                    count += right - left
                    right -= 1
                else:
                    left += 1
        return count
# @lc code=end

