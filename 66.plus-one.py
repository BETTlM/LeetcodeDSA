#
# @lc app=leetcode id=66 lang=python
#
# [66] Plus One
#

# @lc code=start
class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        strNum = ''
        for i in digits:
            strNum += str(i)
        newStrNum = str(int(strNum) + 1)
        retList = []
        for i in newStrNum:
            retList.append(int(i))
        return retList
        
# @lc code=end

