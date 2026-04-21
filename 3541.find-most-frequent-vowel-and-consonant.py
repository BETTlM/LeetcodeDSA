#
# @lc app=leetcode id=3541 lang=python
#
# [3541] Find Most Frequent Vowel and Consonant
#

# @lc code=start
class Solution(object):
    def maxFreqSum(self, s):
        """
        :type s: str
        :rtype: int
        """
        vowels = set('aeiou')
        v = dict()
        c = dict()
        for i in s:
            if i in vowels:
                if i in v.keys():
                    v[i] += 1
                else:
                    v[i] = 1
            else:
                if i in c.keys():
                    c[i] += 1
                else:
                    c[i] = 1
        vs = v.values()
        cs = c.values()
        if not vs:
            return max(cs)
        elif not cs:
            return max(vs)
        else:
            return max(vs) + max(cs)
# @lc code=end

