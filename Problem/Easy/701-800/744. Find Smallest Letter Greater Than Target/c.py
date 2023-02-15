# beg and end is optimal

# # 1. bisect(list, num, beg, end): -
# This function returns the position in the sorted list,
# where the number passed in argument can be placed so as to maintain the resultant list in sorted order.
# If the element is already present in the list,
# the right most position where element has to be inserted is returned. This function takes 4 arguments,
# list which has to be worked with,
# number to insert, starting position in list to consider, ending position which has to be considered.

# 2. bisect_left(list, num, beg, end): - the left most position where element has to be inserted is returned

import bisect


class Solution(object):
    def nextGreatestLetter(self, letters, target):
        # index = bisect.bisect(letters, target)
        # return letters[index % len(letters)]

        return letters[
            bisect.bisect(letters, target) % len(letters)
        ]
