#
# @lc app=leetcode id=58 lang=python
#
# [58] Length of Last Word
#

# @lc code=start
class Solution(object):
    def lengthOfLastWord(self, s):
        """
        :type s: str
        :rtype: int
        """
        start = False
        count = 0
        for i in s[::-1]:
            if i !=' ':
                start = True 
            if i == ' ' and start:
                break
            if i != ' ':
                count += 1
        return count

        
# @lc code=end

