#
# @lc app=leetcode id=290 lang=python
#
# [290] Word Pattern
#

# @lc code=start
class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        if not pattern and not s:
            return True
        if not pattern or not s:
            return False
        map = dict()
        hashset = set()
        words = s.split()
        if len(words) != len(pattern):
            return False
        for i in range(len(pattern)):
            if pattern[i] in map.keys():
                if map[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in hashset:
                    return False
                hashset.add(words[i])
                map[pattern[i]] = words[i]
        return True
        
# @lc code=end

