#
# @lc app=leetcode id=2000 lang=python
#
# [2000] Reverse Prefix of Word
#

# @lc code=start
class Solution(object):
    def reversePrefix(self, word, ch):
        """
        :type word: str
        :type ch: str
        :rtype: str
        """
        
        ca = list(word)
        n = len(ca)
        i = 0
        j = 0
        while j < n:
            if ca[j] == ch:
                break
            j += 1
        if j != n:
            while i < j:
                ca[i], ca[j] = ca[j], ca[i]
                i += 1
                j -= 1
        return ''.join(ca)
# @lc code=end

