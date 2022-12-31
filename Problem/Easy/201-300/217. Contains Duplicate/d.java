// sort
// if current pos ele val == last ele val
// found duplicate

// time: 19 ms
// Time complexity: O(n*log(n))
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1])
				return true;
		}

		return false;
	}
}
