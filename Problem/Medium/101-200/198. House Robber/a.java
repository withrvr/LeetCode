// ex: 2,1,1,2,x,x,x,x

// nums[3]   =   nums[3]   +   Math.max(nums[0], nums[1]);

// To Code : 30 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		// if (nums.length == 3)
		// return Math.max(nums[1], nums[2] + nums[0]);

		nums[2] += nums[0];

		for (int i = 3; i < nums.length; i++)
			nums[i] += Math.max(nums[i - 3], nums[i - 2]);

		return Math.max(nums[nums.length - 2], nums[nums.length - 1]);
	}
}
