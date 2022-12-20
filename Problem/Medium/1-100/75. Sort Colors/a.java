class Solution {
	public void sortColors(int[] nums) {
		int rwb[] = new int[] { 0, 0, 0 };

		// couting 0, 1, 2
		for (int x : nums)
			rwb[x]++;

		// storing 0, 1, 2, in nums
		for (int i = 0; i < rwb[0]; ++i)
			nums[i] = 0;
		for (int i = 0; i < rwb[1]; ++i)
			nums[i + rwb[0]] = 1;
		for (int i = 0; i < rwb[2]; ++i)
			nums[i + rwb[0] + rwb[1]] = 2;

		// use above more fast ... but just to know
		// for (int i = 0; i < nums.length; ++i)
		// if (i < rwb[0])
		// nums[i] = 0;
		// else if (i < rwb[0] + rwb[0])
		// nums[i] = 1;
		// else
		// nums[i] = 2;
	}
}