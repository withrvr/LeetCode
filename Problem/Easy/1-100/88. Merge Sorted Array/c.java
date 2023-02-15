// same array

// To Code : 30 min
// Execution : 0 ms

// Time complexity: O(m+n) => O(num1.length) => O(n)
// Space complexity: O(1)

class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		for (int i = nums_1.length - 1; i >= 0; i--) {
			if (m == 0)
				nums_1[i] = nums_2[--n];
			else if (n == 0)
				nums_1[i] = nums_1[--m];
			else
				nums_1[i] = nums_1[m - 1] > nums_2[n - 1] ? nums_1[--m] : nums_2[--n];
		}
	}
}
