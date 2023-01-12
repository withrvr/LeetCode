// using while loop

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

// class xyz {
// 	public static void main(String[] args) {
// 		Solution s = new Solution();
// 		int arr[] = new int[] { -1, 0, 3, 5, 9, 12 };
// 		System.out.println("Ans:- " + s.search(arr, 5));
// 	}
// }

class Solution {
	public int search(int[] nums, int target) {
		int left = 0, right = nums.length - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;
			// mid = (left + right) >> 1; // using bit operation

			// System.out.println(String.format("%d %d %d", left, mid, right));

			if (nums[mid] < target)
				left = mid + 1;
			else if (nums[mid] > target)
				right = mid - 1;
			else
				return mid;
		}

		return -1;
	}
}
