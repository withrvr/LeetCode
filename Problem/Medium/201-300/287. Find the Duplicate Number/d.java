// Approach 3: Negative Marking
// https://leetcode.com/problems/find-the-duplicate-number/solutions/127594/find-the-duplicate-number/

// ⚠️: NOTE
// You must solve the problem without modifying the array nums // 💀: we used
// and uses only constant extra space.

// To Code : 5 min
// Execution : 13 ms

// Time complexity: O(n) // 💀
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public int findDuplicate(int[] nums) {
		int cur_val;
		for (int i = 0; i < nums.length; i++) {
			cur_val = Math.abs(nums[i]); // if already -ve

			System.out.println(String.format(
					"i=%d, cur_val=%d, nums[cur_val]=%2d, for_nums=%s", i, cur_val, nums[cur_val],
					Arrays.toString(nums)));

			if (nums[cur_val] < 0) {
				return cur_val;
			} else {
				nums[cur_val] = -nums[cur_val]; // nums[cur_val] *= -1;
			}
		}

		// // Restore numbers ... should do according to problem
		// for (int i = 0; i < nums.length; i++)
		// nums[i] = Math.abs(nums[i]);

		return -1;
	}
}
