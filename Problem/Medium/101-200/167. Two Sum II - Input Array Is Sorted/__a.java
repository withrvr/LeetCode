class Solution {
	public int[] twoSum(int[] arr, int target) {
		int left = 0, right = arr.length - 1, sum;

		// since infinite loop we can directly return
		while (true) {
			sum = arr[left] + arr[right];

			if (sum == target)
				return new int[] { left + 1, right + 1 };
			else if (sum < target)
				left++;
			else
				right--;
		}
	}
}
