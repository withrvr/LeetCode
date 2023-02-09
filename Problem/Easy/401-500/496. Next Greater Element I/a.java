// To Code : 3 min
// Execution : 5 ms

// Time complexity: O(n*m)
// Space complexity: O(1)

class Solution {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int res[] = new int[nums1.length];

		for (int i = 0; i < nums1.length; i++) {
			boolean found = false;
			res[i] = -1;

			for (int j = 0; j < nums2.length; j++) {
				if (found && nums2[j] > nums1[i]) {
					res[i] = nums2[j];
					break;
				}
				if (nums1[i] == nums2[j])
					found = true;
			}
		}

		return res;
	}
}
