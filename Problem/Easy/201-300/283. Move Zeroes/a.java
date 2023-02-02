//💀: extra space
// which is not allowed according to question

// To Code : 15 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Arrays;

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		// arr = new int[] { 33 };
		arr = new int[] { 44, 88, 0, 55, 0, 22, 0, 0 };
		s.moveZeroes(arr);
		System.out.println("\nAns:- " + Arrays.toString(arr) + "\n");
	}
}

class Solution {
	public void moveZeroes(int[] nums) {

		int[] res = new int[nums.length];
		int j = 0;

		for (int i = 0; i < nums.length; i++)
			if (nums[i] != 0)
				res[j++] = nums[i];

		for (int i = 0; i < res.length; i++)
			nums[i] = res[i];
	}
}
