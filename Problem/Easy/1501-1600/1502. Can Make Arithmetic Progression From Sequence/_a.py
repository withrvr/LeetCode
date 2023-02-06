class Solution:
    def canMakeArithmeticProgression(self, arr) -> bool:
        arr.sort()
        diff = arr[1] - arr[0]

        for i in range(1, len(arr)):
            if (arr[i] - arr[i-1] != diff):
                return False
        # Note:- else of for loop
        else:
            return True
