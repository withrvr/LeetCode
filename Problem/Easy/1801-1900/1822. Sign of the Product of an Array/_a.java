// using double to solve that problem

// 1/2 ms

class Solution {
	public int arraySign(int[] nums) {
		// Double mul = 1.0;
		double mul = 1.0;

		for (int num : nums)
			mul *= Double.valueOf(num);

		return mul > 0.0 ? 1 : mul < 0.0 ? -1 : 0;
	}
}
