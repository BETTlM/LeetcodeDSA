#
# @lc app=leetcode id=2114 lang=python
#
# [2114] Maximum Number of Words Found in Sentences
#

# @lc code=start
class Solution(object):
    def mostWordsFound(self, sentences):
        """
        :type sentences: List[str]
        :rtype: int
        """
        m = 0
        for i in sentences:
            c = 1
            for j in i:
                if j == ' ':
                    c += 1
            m = max(m,c)
        return m
        
# @lc code=end

