class Solution {
	public void merge(int[] nums_1, int m, int[] nums_2, int n) {
		int i = nums_1.length;

		// while (--i >= 0)
		while (--i > -1)
			nums_1[i] = m == 0 ? nums_2[--n]
					: n == 0 ? nums_1[--m]
							: nums_1[m - 1] > nums_2[n - 1] ? nums_1[--m] : nums_2[--n];
	}
}
