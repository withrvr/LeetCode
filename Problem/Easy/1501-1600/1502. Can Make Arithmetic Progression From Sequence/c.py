# set
# if only one value in it
# means only 1 diff was there

class Solution:
    def canMakeArithmeticProgression(self, arr) -> bool:
        arr.sort()
        return len(set(arr[i-1] - arr[i] for i in range(1, len(arr)))) == 1
