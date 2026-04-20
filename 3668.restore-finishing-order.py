#
# @lc app=leetcode id=3668 lang=python
#
# [3668] Restore Finishing Order
#

# @lc code=start
class Solution(object):
    def recoverOrder(self, order, friends):
        """
        :type order: List[int]
        :type friends: List[int]
        :rtype: List[int]
        """
        friend = set()
        for i in friends:
            friend.add(i)
        result = []
        for i in order:
            if i in friend:
                result.append(i)
        return result
        
# @lc code=end

