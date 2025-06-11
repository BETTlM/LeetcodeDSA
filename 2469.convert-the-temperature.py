#
# @lc app=leetcode id=2469 lang=python
#
# [2469] Convert the Temperature
#

# @lc code=start
class Solution(object):
    def convertTemperature(self, celsius):
        """
        :type celsius: float
        :rtype: List[float]
        """
        return [celsius + 273.15, celsius*1.8 + 32]
        
        
# @lc code=end

