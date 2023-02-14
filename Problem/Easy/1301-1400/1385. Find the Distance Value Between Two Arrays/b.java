import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr1[], arr2[];
		// arr = new int[] { 33 };
		arr1 = new int[] { 1, 4, 2, 3 };
		arr2 = new int[] { -4, -3, 6, 10, 20, 30 };

		arr1 = new int[] { 4, 5, 8 };
		arr2 = new int[] { 10, 9, 1, 8 };

		int d = 2;

		// System.out.println("\nAns:- " + Arrays.toString(arr) + "\n");
		System.out.println("\nAns:- " + s.findTheDistanceValue(arr1, arr2, d) + "\n");
	}
}

class Solution {

	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		Arrays.sort(arr2);

		// System.out.println(Arrays.toString(arr1));
		// System.out.println(Arrays.toString(arr2));

		int distance = 0;

		for (int val : arr1) {
			// System.out.println(String.format("\n\n%d : %d : %d", val, val - d, val + d));

			if (notInRange(arr2, val - d, val + d))
				distance++;
		}

		return distance;
	}

	// Checks if the array doesn't contain any value in range (from <= value <= to)
	// using binary search
	private static boolean notInRange(int[] arr, int from, int to) {
		int start = 0;
		int end = arr.length - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;

			// System.out.println(arr[mid]);

			// if number +d -d
			// means number is there near him
			// don't count
			if (arr[mid] >= from && arr[mid] <= to)
				return false;
			else if (arr[mid] < from)
				start = mid + 1;
			else
				end = mid - 1;
		}

		// no number +d or -d
		// then count
		return true;
	}
}