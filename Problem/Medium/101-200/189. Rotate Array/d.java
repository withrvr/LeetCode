// reverse

// reverse the ending part
// reverse then starting part
// reverse then whole array

// Proper logic / Explanation
// https://leetcode.com/problems/rotate-array/solutions/1730142/java-c-python-a-very-very-well-detailed-explanation/

// To Code   : 15m 30s
// Execution : 1 ms
// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	private static void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}

	public void rotate(int[] arr, int k) {
		int n = arr.length;
		k %= n; // rotate: no extra rotation

		if (k == 0) // || n < 2
			return;

		// // easy to understand the logic
		// reverse(arr, 0, n - k - 1);
		// reverse(arr, n - k, n - 1);
		// reverse(arr, 0, n - 1);

		// more better in performance / alternative
		reverse(arr, 0, n - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, n - 1);

	}
}
