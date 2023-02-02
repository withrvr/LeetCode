// this will work because its given
// nums is sorted

// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
	public int[] sortedSquares(int[] nums) {
		int left = 0, right = nums.length - 1;
		int result[] = new int[nums.length];

		// while (left <= right) {
		for (int reverse = nums.length - 1; reverse >= 0; reverse--) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[reverse] = nums[left] * nums[left];
				// System.out.print(left + " left ");
				left++;
			} else {
				result[reverse] = nums[right] * nums[right];
				// System.out.print(right + " right");
				right--;
			}

			// System.out.println(" ... :" + reverse + ": " + left + " - " + right);
			// reverse--;
		}

		return result;
	}
}
