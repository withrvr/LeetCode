class Solution {
	public int[] twoSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1, sum;

		// need to add
		// left < right
		// some logic condition to stop

		while (left < right) {
			sum = arr[left] + arr[right];

			if (sum == target)
				return new int[] { left + 1, right + 1 };
			else if (sum < target)
				left++;
			else
				right--;
		}

		// so NOTE: we can return null only .... if not got value
		return null;
	}
}
