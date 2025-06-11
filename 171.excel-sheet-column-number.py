
#
# @lc app=leetcode id=171 lang=python
#
# [171] Excel Sheet Column Number
#

# @lc code=start
class Solution(object):
    def titleToNumber(self, columnTitle):
        """
        :type columnTitle: str
        :rtype: int
        """
        row = 0
        power = 0
        for i in columnTitle[::-1]:
            value = (26**power) * (ord(i) - 64)
            row += value
            power += 1
        return row
        
        
# @lc code=end

