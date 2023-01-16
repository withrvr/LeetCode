# build in method

from itertools import accumulate


class Solution:
    def runningSum(self, nums):
        return list(accumulate(nums))
