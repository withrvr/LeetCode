// using while loop
// binary search

// mid as insertion point

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

class Solution {
	public int searchInsert(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		int mid = 0, val = nums[mid];

		while (left <= right) {
			mid = (left + right) / 2;
			val = nums[mid];

			// System.out.println(String.format("%d %d %d", left, mid, right));

			if (val < target)
				left = mid + 1;
			else if (val > target)
				right = mid - 1;
			else
				return mid;
		}

		return target < val ? mid : mid + 1;
	}
}
