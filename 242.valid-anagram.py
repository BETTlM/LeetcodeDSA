#
# @lc app=leetcode id=242 lang=python
#
# [242] Valid Anagram
#

# @lc code=start
from collections import defaultdict


class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        his = defaultdict(int)
        if len(s) != len(t):
            return False
        for i in s:
            his[i] += 1
        for i in t:
            his[i] -= 1
        for i in his.values():
            if i != 0:
                return False
        return True
# @lc code=end

