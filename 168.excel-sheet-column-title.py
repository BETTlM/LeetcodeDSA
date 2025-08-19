#
# @lc app=leetcode id=168 lang=python
#
# [168] Excel Sheet Column Title
#

# @lc code=start
class Solution(object):
    def convertToTitle(self, columnNumber):
        """
        :type columnNumber: int
        :rtype: str
        """
        ans = ''
        while columnNumber > 0:
            columnNumber -= 1
            last = columnNumber%(26)
            letter = chr(65 + last)
            columnNumber = columnNumber//26
            ans += letter
        return ans[:: -1]
        
# @lc code=end

