// Kadane’s Algorithm
// with start, end index

// can't use starting with index = 1 here

// To Code : 30 min
// Execute : 1 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int maxSubArray(int[] arr) {
		int max = Integer.MIN_VALUE, sum = 0;
		// sum = arr[0] .. don't work ... if all -ve number .. or something like that
		// int start = 0, end = 0, temp_s = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum > max)
				max = sum;

			if (sum < 0)
				sum = 0;
		}
		return max;
	}
}
