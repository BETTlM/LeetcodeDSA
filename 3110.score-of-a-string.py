#
# @lc app=leetcode id=3110 lang=python
#
# [3110] Score of a String
#

# @lc code=start
class Solution(object):
    def scoreOfString(self, s):
        """
        :type s: str
        :rtype: int
        """
        score = 0
        for i in range(len(s) - 1):
            score += abs(ord(s[i]) - ord(s[i+1]))
        return score
        
        
# @lc code=end

