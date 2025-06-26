#
# @lc app=leetcode id=389 lang=python
#
# [389] Find the Difference
#

# @lc code=start
class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        result = 0
        for i in s:
            result^=ord(i)
        for j in t:
            result^=ord(j)
        return chr(result)
        
# @lc code=end

