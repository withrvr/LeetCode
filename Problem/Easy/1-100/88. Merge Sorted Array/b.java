// using extra array

// To Code : 30 min
// Execution : 0 ms

// Time complexity: O(m+m)
// Space complexity: O(m)

class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		int res[] = new int[nums_1.length];

		// pointers for both array
		int point_1 = 0;
		int point_2 = 0;

		for (int i = 0; i < res.length; i++) {
			// if point_1 reached ... add nums_2 data
			if (point_1 == m)
				res[i] = nums_2[point_2++];
			// vise versa ... like above
			else if (point_2 == n)
				res[i] = nums_1[point_1++];
			else
				// which is smaller
				res[i] = nums_1[point_1] < nums_2[point_2] ? nums_1[point_1++] : nums_2[point_2++];
		}

		// coping the res to num_1
		for (int i = 0; i < nums_1.length; i++) {
			nums_1[i] = res[i];
		}
	}
}
