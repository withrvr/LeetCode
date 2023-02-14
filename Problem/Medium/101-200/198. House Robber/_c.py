class Solution:
    def rob(self, nums):
        first = second = 0

        for val in nums:
            first, second = second, max(second, val + first)

        return second
