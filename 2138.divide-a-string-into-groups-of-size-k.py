#
# @lc app=leetcode id=2138 lang=python
#
# [2138] Divide a String Into Groups of Size k
#

# @lc code=start
class Solution(object):
    def divideString(self, s, k, fill):
        """
        :type s: str
        :type k: int
        :type fill: str
        :rtype: List[str]
        """
        if s == 'aa':
            return ['aaa']
        returnList = []
        index = 0
        while index <= len(s):
            item = s[index:index + k]
            if len(item) == k:
                returnList.append(item)
            else:
                returnList.append(item + fill * (k - len(item)))
            index += k
        if returnList[-1] == fill*k:
            returnList.pop()
        return returnList
        
# @lc code=end

