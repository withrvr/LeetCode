// xor

// To Code : 3 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int singleNumber(int[] nums) {
		int ans = 0;

		for (int val : nums)
			ans ^= val;

		return ans;
	}
}
