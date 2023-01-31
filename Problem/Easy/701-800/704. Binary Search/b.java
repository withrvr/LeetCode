// using function / recursion

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

// class xyz {
// 	public static void main(String[] args) {
// 		Solution s = new Solution();
// 		int arr[] = new int[] { -1, 0, 3, 6, 9, 12 };
// 		System.out.println("Ans:- " + s.search(arr, 5));
// 	}
// }

class Solution {
	public int helper(int[] nums, int target, int left, int right) {
		int mid = (left + right) / 2;

		// System.out.println(String.format("%d %d %d", left, mid, right));

		if (right < left)
			return -1;

		if (nums[mid] < target)
			return helper(nums, target, mid + 1, right);
		else if (nums[mid] > target)
			return helper(nums, target, left, mid - 1);
		else
			return mid;

	}

	public int search(int[] nums, int target) {
		return helper(nums, target, 0, nums.length - 1);
	}
}
