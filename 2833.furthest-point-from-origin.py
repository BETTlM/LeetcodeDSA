#
# @lc app=leetcode id=2833 lang=python
#
# [2833] Furthest Point From Origin
#

# @lc code=start
class Solution(object):
    def furthestDistanceFromOrigin(self, moves):
        """
        :type moves: str
        :rtype: int
        """
        a = 0
        b = 0
        for i in moves:
            if i =='L':
                a += 1
            elif i == 'R':
                a -= 1
            else:
                b += 1
        return abs(a) + b
        
# @lc code=end

