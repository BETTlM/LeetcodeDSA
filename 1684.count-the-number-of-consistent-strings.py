#
# @lc app=leetcode id=1684 lang=python
#
# [1684] Count the Number of Consistent Strings
#

# @lc code=start
class Solution(object):
    def countConsistentStrings(self, allowed, words):
        """
        :type allowed: str
        :type words: List[str]
        :rtype: int
        """
        allw = set(allowed)
        c = 0
        for i in words:
            for j in i:
                if j not in allw:
                    c += 1
                    break
        return len(words) - c
        
# @lc code=end

