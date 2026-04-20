#
# @lc app=leetcode id=3289 lang=python
#
# [3289] The Two Sneaky Numbers of Digitville
#

# @lc code=start
class Solution(object):
    def getSneakyNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        hm = dict()
        for i in nums:
            if i in hm.keys():
                hm[i] += 1
            else:
                hm[i] = 1
        result = []
        for i in hm.keys():
            if hm[i] == 2:
                result.append(i)
            if len(result) == 2:
                return result
# @lc code=end

