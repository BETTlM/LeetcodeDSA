#
# @lc app=leetcode id=3024 lang=python
#
# [3024] Type of Triangle
#

# @lc code=start
class Solution(object):
    def triangleType(self, nums):
        """
        :type nums: List[int]
        :rtype: str
        """
        flag = True
        for i in range(3):
            if nums[i] >= nums[(i+1)%3]+nums[(i+2)%3]:
                flag = False
        if not flag:
            return "none"
        if len(set(nums)) == 3:
            return "scalene"
        elif len(set(nums)) == 2:
            return "isosceles"
        else:
            return "equilateral"
        
        
# @lc code=end

