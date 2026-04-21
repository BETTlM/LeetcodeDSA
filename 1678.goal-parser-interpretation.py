#
# @lc app=leetcode id=1678 lang=python
#
# [1678] Goal Parser Interpretation
#

# @lc code=start
class Solution(object):
    def interpret(self, command):
        """
        :type command: str
        :rtype: str
        """
        command = command.replace("()","o")
        command = command.replace('(al)','al')
        return command
        
# @lc code=end

