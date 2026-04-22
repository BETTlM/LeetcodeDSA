#
# @lc app=leetcode id=219 lang=python
#
# [219] Contains Duplicate II
#

# @lc code=start
class Solution(object):
    def containsNearbyDuplicate(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: bool
        """
        hm = set()
        for i in range(len(nums)):
            if i > k:
                hm.remove(nums[i - k - 1])
            if nums[i] in hm:
                return True
            hm.add(nums[i])
        return False
        
# @lc code=end

