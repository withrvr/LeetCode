// binary search

// - `[3,5,3,2,0]`
// works only if / should be
// low = 1
// else index out of bounce -1

// To Code : 3 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

// import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		// arr = new int[] { 33 };
		// arr = new int[] { 18, 29, 38, 59, 98, 100, 99, 98, 90 };
		arr = new int[] { 3, 5, 3, 2, 0 };

		// System.out.println("\nAns:- " + Arrays.toString(arr) + "\n");
		System.out.println("\nAns:- " + s.peakIndexInMountainArray(arr) + "\n");
	}
}

class Solution {
	public int peakIndexInMountainArray(int[] arr) {
		// NOTE: given arr.len >=3
		// so low = 1
		// high = len-2
		int low = 1, high = arr.length - 2, mid;

		while (true) {
			mid = low + (high - low) / 2;

			System.out.println(String.format("%4d : %4d : %4d", low, mid, high));

			if (arr[mid - 1] < arr[mid])
				if (arr[mid] > arr[mid + 1])
					return mid;
				else
					low = mid + 1;
			else
				high = mid - 1;
		}
	}
}
