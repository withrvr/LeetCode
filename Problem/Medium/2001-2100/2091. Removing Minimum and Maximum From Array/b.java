// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/submissions/854963816/

class Solution {
	public int minimumDeletions(int[] nums) {
		int max_index = 0;
		int min_index = 0;
		int n = nums.length;

		for (int i = 1; i < n; i++) {
			if (nums[i] > nums[max_index])
				max_index = i;

			if (nums[i] < nums[min_index])
				min_index = i;
		}

		// 3 cases possible
		// - both delete from left
		// - both delete from right
		// - right and left together

		// delete from left side
		int rightmost = Math.max(max_index, min_index);
		int del_from_left = rightmost + 1;

		// delete from right side
		int leftmost = Math.min(max_index, min_index);
		int del_from_right = n - leftmost;

		// from both sides
		int del_from_both = (n - rightmost) + (leftmost + 1);

		// return which is the min distance out of 3 cases
		return Math.min(
				Math.min(del_from_left, del_from_right),
				del_from_both);
	}
}