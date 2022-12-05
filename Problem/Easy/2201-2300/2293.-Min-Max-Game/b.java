// https://leetcode.com/problems/min-max-game/submissions/854431073/

class Solution {
	public int minMaxGame(int[] nums) {
		int n = nums.length;
		while (n > 1) {
			for (int i = 0; i < n / 2; i++)
				nums[i] = i % 2 == 0 ? Math.min(nums[2 * i], nums[2 * i + 1]) : Math.max(nums[2 * i], nums[2 * i + 1]);
			n /= 2;
		}
		return nums[0];
	}
}