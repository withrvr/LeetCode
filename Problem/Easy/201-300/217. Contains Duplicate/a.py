# sets

# set(arr).size
# not same arr.size ... duplicate

# Time: ?
# Time complexity: O(n)
# Space complexity: O(n)

class Solution:
    def containsDuplicate(self, nums):
        return len(set(nums)) != len(nums)
