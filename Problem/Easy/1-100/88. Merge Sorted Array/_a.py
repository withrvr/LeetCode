class Solution:
    def merge(self, nums1, m, nums2, n):
        nums2.extend(nums1[:m])
        nums2.sort()

        nums1[:] = nums2
