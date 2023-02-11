// To Code : 5 min
// Execution : 56 ms

// Time complexity: O(n^2)
// Space complexity: O(1)

class NumArray {
	int[] nums;

	public NumArray(int[] nums) {
		this.nums = nums;
	}

	public int sumRange(int left, int right) {
		int sum = 0;

		for (int i = left; i <= right; i++)
			sum += nums[i];

		return sum;

	}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */