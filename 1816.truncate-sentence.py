#
# @lc app=leetcode id=1816 lang=python
#
# [1816] Truncate Sentence
#

# @lc code=start
class Solution(object):
    def truncateSentence(self, s, k):
        """
        :type s: str
        :type k: int
        :rtype: str
        """
        r = ''
        c = 0
        for i in s:
            if i == ' ':
                c+=1
            if c == k:
                break
            r += i
        return r
        
# @lc code=end

