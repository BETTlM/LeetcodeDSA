#
# @lc app=leetcode id=1598 lang=python
#
# [1598] Crawler Log Folder
#

# @lc code=start
class Solution(object):
    def minOperations(self, logs):
        """
        :type logs: List[str]
        :rtype: int
        """
        depth = 0
        for i in logs:
            if i == "./":
                pass
            elif i == "../":
                if depth > 0:
                    depth -= 1
            else:
                depth += 1
        return depth
# @lc code=end

