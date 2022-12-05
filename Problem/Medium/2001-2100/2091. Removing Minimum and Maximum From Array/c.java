// https://leetcode.com/problems/removing-minimum-and-maximum-from-array/submissions/854975246/

class Solution {
	public int minimumDeletions(int[] nums) {
		// no need of max/min value,
		// directly store the min/max index of element
		int max_index = 0;
		int min_index = 0;
		int n = nums.length; // since needed multiple time

		// finding the min/max index in the unsorted nums
		for (int i = 1; i < n; i++) {
			if (nums[i] > nums[max_index])
				max_index = i;

			if (nums[i] < nums[min_index])
				min_index = i;
		}

		// in case if min_value_index comes after the max_value_index
		// why swap? : so that caluculate become easy no multiple equations
		// why? : so that leftmost index is store in min_index only
		// viseversa ... saves memeory and time
		if (min_index > max_index) {
			int temp = min_index;
			min_index = max_index;
			max_index = temp;
		}

		// int del_from_left = max_index + 1;
		// int del_from_right = n - min_index;
		// int del_from_both = (n - max_index) + (min_index + 1);

		// return which is the min distance out of 3 cases
		return Math.min(
				Math.min(
						max_index + 1, // del_from_left
						n - min_index // del_from_right
				),
				(n - max_index) + (min_index + 1) // del_from_both
		);
	}
}