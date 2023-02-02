// 1 ms

class Solution {
	public int[] sortedSquares(int[] nums) {
		int left = 0, right = nums.length - 1;
		int result[] = new int[nums.length];

		for (int reverse = nums.length - 1; reverse >= 0; reverse--) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[reverse] = nums[left] * nums[left];
				left++;
			} else {
				result[reverse] = nums[right] * nums[right];
				right--;
			}
		}

		return result;
	}
}
