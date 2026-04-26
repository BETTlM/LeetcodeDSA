#
# @lc app=leetcode id=2325 lang=python
#
# [2325] Decode the Message
#

# @lc code=start
class Solution(object):
    def decodeMessage(self, key, message):
        """
        :type key: str
        :type message: str
        :rtype: str
        """
        keymap = dict()
        ind = 0
        for i in key:
            if i == ' ':
                continue
            if i not in keymap:
                keymap[i] = chr(ord('a') + ind)
                ind += 1

        s = ''
        for i in message:
            if i in keymap:
                s += keymap[i]
            else:
                s += i
        return s
        
# @lc code=end

