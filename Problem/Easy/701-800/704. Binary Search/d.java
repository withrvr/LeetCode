// lol: build in method

// To Code : 5 min
// Execution : ? ms

// Time complexity: O(log(n))
// Space complexity: O(1)

import java.util.Arrays;

// class xyz {
// 	public static void main(String[] args) {
// 		Solution s = new Solution();
// 		int arr[] = new int[] { 1, 2, 9, 9, 11, 11 };
// 		System.out.println("Ans:- " + s.search(arr, 10));
// 	}
// }

class Solution {
	public int search(int[] nums, int target) {
		int index = Arrays.binarySearch(nums, target);
		return index >= 0 ? index : -1;
	}
}
