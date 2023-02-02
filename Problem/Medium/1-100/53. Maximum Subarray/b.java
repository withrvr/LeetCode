class Solution {
	public int maxSubArray(int[] arr) {
		int sum = arr[0], max = arr[0];
		// sum: current_sum

		for (int i = 1; i < arr.length; i++) {
			sum = Math.max(arr[i], sum + arr[i]);
			max = Math.max(max, sum);
		}

		return max;
	}
}
