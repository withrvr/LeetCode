# nice python .. one line

class Solution:
	def rotate(self, nums, k: int) -> None:
		k %= len(nums)
		nums[:] = nums[-k:] + nums[:-k]

