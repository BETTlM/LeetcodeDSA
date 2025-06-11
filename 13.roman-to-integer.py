#
# @lc app=leetcode id=13 lang=python
#
# [13] Roman to Integer
#

# @lc code=start
class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        values = {
            'I' : 1,
            'V' : 5,
            'X' : 10,
            'L' : 50,
            'C' : 100,
            'D' : 500,
            'M' : 1000
        }

        value = 0
        s = s[::-1]
        for i in range(len(s)):
            if i == 0:
                value += values[s[i]];
            else:
                if values[s[i-1]] > values[s[i]]:
                    value -= values[s[i]]
                else:
                    value += values[s[i]]
        return value

        
# @lc code=end

