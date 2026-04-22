#
# @lc app=leetcode id=387 lang=python
#
# [387] First Unique Character in a String
#

# @lc code=start
class Solution(object):
    def firstUniqChar(self, s):
        """
        :type s: str
        :rtype: int
        """
        hashmap = dict()
        seen = set()
        for i in range(len(s)):
            if s[i] in seen:
                if s[i] in hashmap:
                    del hashmap[s[i]]
            else:
                seen.add(s[i])
                hashmap[s[i]] = i
        if not hashmap:
            return -1
        return min(hashmap.values())
        
# @lc code=end

