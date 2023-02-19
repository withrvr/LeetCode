class Solution {
	public int[] twoSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1, sum;

		while (true) {
			sum = arr[left] + arr[right];

			if (sum == target)
				break;
			else if (sum < target)
				left++;
			else
				right--;
		}

		return new int[] { left + 1, right + 1 };
	}
}
