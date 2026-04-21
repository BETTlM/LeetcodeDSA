#
# @lc app=leetcode id=1108 lang=python
#
# [1108] Defanging an IP Address
#

# @lc code=start
class Solution(object):
    def defangIPaddr(self, address):
        """
        :type address: str
        :rtype: str
        """
        return address.replace('.','[.]')

# @lc code=end

