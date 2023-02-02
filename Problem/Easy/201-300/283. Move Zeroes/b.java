// same array
// tracking first occurrence of 0

// then pointing it
// and making it which ever is the next number

// To Code : 15 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.Arrays;

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		// arr = new int[] { 33 };
		arr = new int[] { 44, 88, 0, 0, 0, 55, 0, 22, 0, 0 };
		s.moveZeroes(arr);
		System.out.println("\nAns:- " + Arrays.toString(arr) + "\n");
	}
}

class Solution {
	public void moveZeroes(int[] nums) {
		int point = 0;

		for (int i = 0; i < nums.length; i++) {

			// first occurrence of 0
			if (nums[i] == 0) {
				point = i;

				for (i = point + 1; i < nums.length; i++) {
					if (nums[i] != 0) {
						nums[point++] = nums[i];
						nums[i] = 0;
					}
				}
			}
		}
	}
}
