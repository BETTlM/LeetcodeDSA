#
# @lc app=leetcode id=409 lang=python
#
# [409] Longest Palindrome
#

# @lc code=start
class Solution(object):
    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: int
        """
        maps = dict()
        for i in s:
            if i not in maps:
                maps[i] = 1
            else:
                maps[i] += 1
        size = 0
        odd = False
        for i in maps.values():
            if i & 1 == 0:
                size += i
            else:
                size += i - 1
                odd = True
        if odd:
            size += 1
        return size
# @lc code=end

