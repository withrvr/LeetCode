// https://leetcode.com/problems/min-max-game/submissions/854421880/

class Solution {
	public int minMaxGame(int[] nums) {
		int n = nums.length;
		if (n == 1)
			return nums[0];

		int new_arr[] = new int[n / 2];

		for (int i = 0; i < new_arr.length; i++)
			new_arr[i] = i % 2 == 0 ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);

		return minMaxGame(new_arr);
	}
}