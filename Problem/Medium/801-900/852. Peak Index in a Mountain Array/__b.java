// NOTE:

// mid will always point low
// ie ... are very close
// if low + 1 == high

// also consider ... because we are checking for mid < mid+1

// thats why
// out of index problem will not come here

class Solution {
	public int peakIndexInMountainArray(int[] arr) {
		int low = 0, high = arr.length - 1, mid;

		while (low < high) {
			mid = low + (high - low) / 2;

			if (arr[mid] < arr[mid + 1])
				low = mid + 1;
			else
				high = mid;
		}

		return low;
	}
}
