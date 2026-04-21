#
# @lc app=leetcode id=771 lang=python
#
# [771] Jewels and Stones
#

# @lc code=start
class Solution(object):
    def numJewelsInStones(self, jewels, stones):
        """
        :type jewels: str
        :type stones: str
        :rtype: int
        """
        j = set()
        for i in jewels:
            j.add(i)
        count = 0
        for i in stones:
            if i in j:
                count += 1
        return count
        
# @lc code=end

