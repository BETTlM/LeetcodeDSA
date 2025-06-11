#
# @lc app=leetcode id=2942 lang=python
#
# [2942] Find Words Containing Character
#

# @lc code=start
class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        count = []
        for i in range(len(words)):
            if x in words[i]:
                count.append(i)
        return count

        
        
# @lc code=end

