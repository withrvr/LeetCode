# 95.94%

class NumArray(object):
    def __init__(self, nums):
        self.arr = [0]

        for num in nums:
            self.arr += self.arr[-1] + num,

    def sumRange(self, i, j):
        return self.arr[j + 1] - self.arr[i]
