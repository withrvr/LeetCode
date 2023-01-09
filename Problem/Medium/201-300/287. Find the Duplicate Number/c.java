// brute force
// all possible combination

// To Code : 2 min
// Execution : TLE ms

// Time complexity: O(n*(n-1)/2)
// Space complexity: O(1)

class Solution {
	public int findDuplicate(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (nums[i] == nums[j]) {
					return nums[i];
				}
			}
		}

		return -1;
	}
}
