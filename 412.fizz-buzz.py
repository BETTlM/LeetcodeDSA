#
# @lc app=leetcode id=412 lang=python
#
# [412] Fizz Buzz
#

# @lc code=start
class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        returnArray = []
        for i in range(1,n+1):
            if i%15 == 0:
                returnArray.append("FizzBuzz")
            elif i%5 == 0:
                returnArray.append("Buzz")
            elif i%3 == 0:
                returnArray.append("Fizz")
            else:
                returnArray.append(str(i))
        return returnArray        
        
# @lc code=end

