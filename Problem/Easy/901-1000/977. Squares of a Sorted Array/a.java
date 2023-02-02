// if nums is unsorted
// this method is more better

// To Code : 3 min
// Execution : 5 ms

// Time complexity: O(n) + Sorting ==> O(n*log(n))
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++)
			nums[i] *= nums[i];

		Arrays.sort(nums);
		return nums;
	}
}
