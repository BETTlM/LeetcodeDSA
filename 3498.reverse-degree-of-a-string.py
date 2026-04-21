#
# @lc app=leetcode id=3498 lang=python
#
# [3498] Reverse Degree of a String
#

# @lc code=start
class Solution(object):
    def reverseDegree(self, s):
        """
        :type s: str
        :rtype: int
        """
        res = 0
        for i in range(len(s)):
            res += (i + 1) * (26 - (ord(s[i]) - ord('a')))
        return res
        
# @lc code=end

