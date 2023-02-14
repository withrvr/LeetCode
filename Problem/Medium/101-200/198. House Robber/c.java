// POV: as nums
// Math.max(nums[1], nums[2] + nums[0])

class Solution {
	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		int first = nums[0];
		int second = Math.max(first, nums[1]);
		int temp;

		for (int i = 2; i < nums.length; i++) {
			// first, second = second, Math.max(second, nums[i] + first);
			temp = first;
			first = second;
			second = Math.max(second, nums[i] + temp);
		}

		return second;
	}
}
