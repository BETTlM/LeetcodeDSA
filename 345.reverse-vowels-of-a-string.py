#
# @lc app=leetcode id=345 lang=python
#
# [345] Reverse Vowels of a String
#

# @lc code=start
class Solution(object):
    def reverseVowels(self, s):
        """
        :type s: str
        :rtype: str
        """
        vowel = set('aeiouAEIOU')
        n = len(s)
        a = list(s)
        left = 0
        right = n - 1
        while left <= right:
            if a[left] not in vowel:
                left += 1
            elif a[right] not in vowel:
                right -= 1
            else:
                a[left], a[right] = a[right], a[left]
                left += 1
                right -= 1
        return ''.join(a)
        
# @lc code=end

