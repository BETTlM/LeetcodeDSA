#
# @lc app=leetcode id=258 lang=python
#
# [258] Add Digits
#

# @lc code=start
class Solution(object):
    def addDigits(self, num):
        """
        :type num: int
        :rtype: int
        """
        sum = 0
        if num < 10:
            return num
        while num>9:
            sum = 0
            while num>0:
                sum += num%10
                num = num//10
            num = sum
        return sum                
# @lc code=end

