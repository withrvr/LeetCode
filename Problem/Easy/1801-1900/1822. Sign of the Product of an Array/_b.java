// 0 ms

class Solution {
	public int arraySign(int[] nums) {
		int neg = 0; // count no of -ve num

		for (int num : nums) {
			if (num == 0)
				return 0;
			else if (num < 0)
				neg++;
		}

		// If count of the negative numbers is even then ans will be 1 else 0.
		// return (neg & 1) == 1 ? -1 : 1;
		return neg % 2 == 0 ? 1 : -1;
	}
}
