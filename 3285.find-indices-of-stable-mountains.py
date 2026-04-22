#
# @lc app=leetcode id=3285 lang=python
#
# [3285] Find Indices of Stable Mountains
#

# @lc code=start
class Solution(object):
    def stableMountains(self, height, threshold):
        """
        :type height: List[int]
        :type threshold: int
        :rtype: List[int]
        """
        r = []
        for i in range(1, len(height)):
            if height[i-1] > threshold:
                r.append(i)
        return r
# @lc code=end

