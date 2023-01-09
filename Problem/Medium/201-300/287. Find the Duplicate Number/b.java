// sort

// ⚠️: NOTE
// You must solve the problem without modifying the array nums // 💀: we used
// and uses only constant extra space.

// To Code : 2 min
// Execution : 42 ms

// Time complexity: O(n*log(n))...sort + O(n) // 💀
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public int findDuplicate(int[] nums) {
		Arrays.sort(nums);

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				return nums[i];
		}

		return -1;
	}
}
