class Solution:
    def sortByBits(self, arr):
        # return sorted(arr, key=lambda x: [bin(x).count('1'), x]) # using array
        # using tuple
        return sorted(arr, key=lambda val: (bin(val).count('1'), val))


x = Solution().sortByBits(
    [1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1, 8, 8, 7, 3, 9]
)

print(x)
