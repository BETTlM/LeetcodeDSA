#
# @lc app=leetcode id=1323 lang=python
#
# [1323] Maximum 69 Number
#

# @lc code=start
class Solution(object):
    def maximum69Number (self, num):
        """
        :type num: int
        :rtype: int
        """
        s = list(str(num))
        for i in range(len(s)):
            if s[i] == '6':
                s[i] = '9'
                break
        n = ''.join(s)
        return int(n)
        
# @lc code=end

