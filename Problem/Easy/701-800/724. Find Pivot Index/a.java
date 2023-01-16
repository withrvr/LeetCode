// proof: https://leetcode.com/problems/find-pivot-index/submissions/879370428/

// right as sum of array, from index 1
// increase, decrease --> left, right
// according to current element

// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(2n) --> O(n)
// Space complexity: O(n)

// class xyz {
// 	public static void main(String[] args) {
// 		Solution s = new Solution();
// 		int arr[];
// 		arr = new int[] { 1, 2, 3 };
// 		arr = new int[] { 1 };
// 		arr = new int[] { 2, 1, -1 };
// 		arr = new int[] { 1, 7, 3, 6, 5, 6 };
// 		System.out.println("\nAns:- " + s.pivotIndex(arr));
// 	}
// }

class Solution {
	public int pivotIndex(int[] nums) {
		int left = 0, right = 0;

		// right sum from 1 to n
		for (int i = 1; i < nums.length; i++)
			right += nums[i];

		// for 0 index
		// System.out.println(String.format("i: %2d --> left: %2d, mid: %2d, right:
		// %2d", 0, left, nums[0], right));
		if (left == right)
			return 0;

		// finding pivot
		for (int i = 1; i < nums.length; i++) {
			left += nums[i - 1];
			right -= nums[i];

			// System.out.println(String.format("i: %2d --> left: %2d, mid: %2d, right:
			// %2d", i, left, nums[i], right));

			if (left == right)
				return i;
		}

		return -1;
	}
}