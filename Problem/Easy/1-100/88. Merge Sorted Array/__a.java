// 1 ms

import java.util.Arrays;

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = m;
		int j = 0;

		while (i < nums1.length)
			nums1[i++] = nums2[j++];

		Arrays.sort(nums1);
	}
}
