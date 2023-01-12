// lol: using linear search
// 💀: while take more time

// To Code : 5 min
// Execution : 1 ms

// Time complexity: O(n) // 💀
// Space complexity: O(1)

// class xyz {
// 	public static void main(String[] args) {
// 		Solution s = new Solution();
// 		int arr[] = new int[] { -1, 0, 3, 6, 9, 12 };
// 		System.out.println("Ans:- " + s.search(arr, 5));
// 	}
// }

class Solution {
	public int search(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target)
				return i;
		}
		return -1;
	}
}
