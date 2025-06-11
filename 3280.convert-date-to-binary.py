#
# @lc app=leetcode id=3280 lang=python
#
# [3280] Convert Date to Binary
#

# @lc code=start
class Solution(object):
    def convertDateToBinary(self, date):
        """
        :type date: str
        :rtype: str
        """
        output = ''
        terms = date.split('-')
        for i in terms:
            output+= bin(int(i))[2::] 
            output += '-'
        return output[:-1:]
        
        
# @lc code=end

