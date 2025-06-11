#
# @lc app=leetcode id=3442 lang=python
#
# [3442] Maximum Difference Between Even and Odd Frequency I
#

# @lc code=start
class Solution(object):
    def maxDifference(self, s):
        """
        :type s: str
        :rtype: int
        """
        from collections import Counter
        
        freq = Counter(s)
        odd = 0
        even = len(s)

        for count in freq.values():
            if count % 2 == 1:
                odd = max(odd, count)
            elif count != 0:
                even = min(even, count)

        return odd - even
        
        
# @lc code=end

