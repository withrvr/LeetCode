// To Code : 5 min
// Execution : 7 ms

// Time complexity: O(n)
// Space complexity: O(1)

class NumArray {
	int[] preSum;

	public NumArray(int[] nums) {
		// if(nums.length == 0) {
		// return;
		// }

		preSum = nums;

		for (

				int i = 1; i < preSum.length; ++i)
			preSum[i] += preSum[i - 1];
	}

	public int sumRange(int left, int right) {

		// in case
		// if (i < 0 || j > array.length) {
		// return 0;
		// }

		// NOTE: if right=0 .... came as in case it will be handled by left
		// BECAUSE: 0 <= left <= right < nums.length

		if (left == 0)
			return preSum[right];

		return preSum[right] - preSum[left - 1];
	}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */