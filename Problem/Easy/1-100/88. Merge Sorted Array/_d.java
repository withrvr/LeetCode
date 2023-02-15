// d.java
// short version

class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i = nums1.length;

		while (n != 0)
			nums1[--i] = m != 0 && nums1[m - 1] > nums2[n - 1]
					? nums1[--m]
					: nums2[--n];
	}
}
