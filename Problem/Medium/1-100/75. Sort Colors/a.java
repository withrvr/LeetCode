class Solution {
	public void sortColors(int[] nums) {

		// red, white, blue
		// aka 0, 1, 2
		int rwb[] = new int[] { 0, 0, 0 };

		// couting 0, 1, 2
		for (int x : nums)
			rwb[x]++;

		// this is the best
		// storing 0, 1, 2, in nums
		for (int i = 0; i < rwb[0]; ++i)
			nums[i] = 0;
		for (int i = 0; i < rwb[1]; ++i)
			nums[i + rwb[0]] = 1;
		for (int i = 0; i < rwb[2]; ++i)
			nums[i + rwb[0] + rwb[1]] = 2;

		// // just to know ... other logic
		// int i = 0, j = 0;
		// for (j += rwb[0]; i < j; ++i)
		// nums[i] = 0;
		// for (j += rwb[1]; i < j; ++i)
		// nums[i] = 1;
		// for (j += rwb[2]; i < j; ++i)
		// nums[i] = 2;

		// // but just to know... 2
		// for (int i = 0; i < nums.length; ++i)
		// if (i < rwb[0])
		// nums[i] = 0;
		// else if (i < rwb[0] + rwb[0])
		// nums[i] = 1;
		// else
		// nums[i] = 2;
	}
}