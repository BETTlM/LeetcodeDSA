#
# @lc app=leetcode id=11 lang=python
#
# [11] Container With Most Water
#

# @lc code=start
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        maximum = 0
        left = 0
        right = len(height) - 1
        while left < right:
            volume = min(height[left],height[right]) * (right - left)
            maximum = max(maximum,volume)
            if height[left] > height[right]:
                right-=1
            else:
                left+=1
        return maximum
# @lc code=end

