// sort

// To Code : 15 min
// Execution : 8 ms

// Time complexity: O(n) + sort => O(n*log(n))
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public int largestPerimeter(int[] nums) {
		Arrays.sort(nums);

		for (int i = nums.length - 3; i >= 0; --i)
			if (nums[i] + nums[i + 1] > nums[i + 2])
				return nums[i] + nums[i + 1] + nums[i + 2];

		return 0;
	}
}

// for me

// -`[5,6,9,10]`-

// to understand
// after sorting
// there will be 9 after 10...so 5,6
// will no
// longer be with 10
