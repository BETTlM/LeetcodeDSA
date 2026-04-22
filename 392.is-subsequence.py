#
# @lc app=leetcode id=392 lang=python
#
# [392] Is Subsequence
#

# @lc code=start
class Solution(object):
    def isSubsequence(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        lens = len(s)
        lent = len(t)
        i = 0
        j = 0
        if (lens == 0):
            return True
        if lent == 0:
            return False
        while j < lent:
            if i == lens:
                return True
            if s[i] == t[j]:
                i += 1
                j += 1
            else:
                j += 1
        return i == lens
        
# @lc code=end

