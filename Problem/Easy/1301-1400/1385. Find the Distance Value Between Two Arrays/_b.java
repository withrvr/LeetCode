// b.java
// short version

import java.util.Arrays;

class Solution {

	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int distance = 0;

		Arrays.sort(arr2);

		for (int val : arr1)

			if (notInRange(arr2, val - d, val + d))
				distance++;

		return distance;
	}

	private static boolean notInRange(int[] arr, int from, int to) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (arr[mid] >= from && arr[mid] <= to)
				return false;
			else if (arr[mid] < from)
				start = mid + 1;
			else
				end = mid - 1;
		}

		return true;
	}
}
