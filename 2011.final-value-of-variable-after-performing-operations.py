#
# @lc app=leetcode id=2011 lang=python
#
# [2011] Final Value of Variable After Performing Operations
#

# @lc code=start
class Solution(object):
    def finalValueAfterOperations(self, operations):
        """
        :type operations: List[str]
        :rtype: int
        """
        val = 0
        for i in operations:
            if i[1] == '-':
                val -= 1
            else:
                val += 1
        return val
# @lc code=end

