class Solution:
    def rob(self, nums):
        n = len(nums)

        if n == 1:
            return nums[0]

        first, second = nums[0], max(nums[0], nums[1])

        for i in range(2, n):
            first, second = second, max(second, nums[i] + first)

        return second
