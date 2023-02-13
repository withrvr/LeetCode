// linear search

// To Code : 3 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int peakIndexInMountainArray(int[] arr) {
		int i = 1;

		for (i = 1; i < arr.length - 1; i++)
			if (arr[i] < arr[i - 1])
				return i - 1;

		return i - 1;
	}
}
