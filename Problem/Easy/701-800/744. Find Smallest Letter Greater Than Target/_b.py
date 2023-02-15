class Solution(object):
    def nextGreatestLetter(self, letters, target):
        if target >= letters[-1] or target < letters[0]:
            return letters[0]

        low = 0
        high = len(letters) - 1

        while low <= high:
            mid = low + (high-low) // 2

            if target >= letters[mid]:
                low = mid+1
            else:
                high = mid-1

        return letters[low]
