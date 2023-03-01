class Solution {
	public int findMiddleIndex(int[] nums) {
		int left = 0, right = 0;

		for (int i = 1; i < nums.length; i++)
			right += nums[i];

		if (left == right)
			return 0;

		for (int i = 1; i < nums.length; i++) {
			left += nums[i - 1];
			right -= nums[i];

			if (left == right)
				return i;
		}

		return -1;
	}
}
