// b.java ... short version

class Solution {
	public int peakIndexInMountainArray(int[] arr) {
		int low = 1, high = arr.length - 2, mid;

		while (true) {
			mid = low + (high - low) / 2;

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
