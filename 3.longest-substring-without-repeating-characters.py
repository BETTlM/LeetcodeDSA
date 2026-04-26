#
# @lc app=leetcode id=3 lang=python
#
# [3] Longest Substring Without Repeating Characters
#

# @lc code=start
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        arr = [False] * 128
        l = r = 0
        max_len = 0

        while r < len(s):
            if not arr[ord(s[r])]:
                arr[ord(s[r])] = True
                max_len = max(max_len, r - l + 1)
                r += 1
            else:
                arr[ord(s[l])] = False
                l += 1
        return max_len
        
# @lc code=end

