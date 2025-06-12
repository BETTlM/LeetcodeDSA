#
# @lc app=leetcode id=125 lang=python
#
# [125] Valid Palindrome
#

# @lc code=start
class Solution(object):
    def isPalindrome(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = s.lower()
        newS = ''
        for i in s:
            if (ord(i) >= 97 and ord(i) <= 122) or (i in '1234567890'):
                newS += i
        return newS == newS[::-1]
# @lc code=end

