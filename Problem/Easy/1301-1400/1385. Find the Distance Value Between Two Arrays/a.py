class Solution:
    def findTheDistanceValue(self, arr_1, arr_2, d):
        count = 0

        for val_1 in arr_1:
            for val_2 in arr_2:
                if (abs(val_1 - val_2) <= d):
                    break
            else:
                count += 1

        return count
