#
# @lc app=leetcode id=3760 lang=python
#
# [3760] Maximum Substrings With Distinct Start
#

# @lc code=start
class Solution(object):
    def maxDistinct(self, s):
        """
        :type s: str
        :rtype: int
        """
        return len(set(s))
# @lc code=end

