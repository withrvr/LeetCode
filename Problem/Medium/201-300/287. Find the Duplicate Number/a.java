// sets

// ⚠️: NOTE
// You must solve the problem without modifying the array nums
// and uses only constant extra space. // 💀: we used

// To Code : 2 min
// Execution : 22 ms

// Time complexity: O(n)
// Space complexity: O(n) // 💀

import java.util.HashSet;

class Solution {
	public int findDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int val : nums) {
			if (set.contains(val))
				return val;

			set.add(val);
		}

		return -1;
	}
}
