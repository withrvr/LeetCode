class Solution:
    def sumOddLengthSubarrays(self, arr: List[int]) -> int:
        res = 0
        n = len(arr)

        for l in range(n):
            for r in range(l+1, n+1, 2):
                res += sum(arr[l:r])

        return res
