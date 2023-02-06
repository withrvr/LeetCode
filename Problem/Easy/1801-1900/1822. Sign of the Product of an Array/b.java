
// To Code : 3 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int arraySign(int[] nums) {
		int sign = 1;

		for (int num : nums)
			if (num == 0)
				return 0;
			else if (num < 0)
				sign = -sign; // sign *= -1;

		return sign;
	}
}
