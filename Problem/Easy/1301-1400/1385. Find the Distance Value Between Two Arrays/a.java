// brute force
// index loop
// with flag

// To Code : 5 min
// Execution : 3 ms

// Time complexity: O(n*m)
// Space complexity: O(1)

class Solution {
	public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
		int count = 0, j;

		for (int i = 0; i < arr1.length; i++) {
			boolean found = true;

			for (j = 0; j < arr2.length; j++)
				if (Math.abs(arr1[i] - arr2[j]) <= d) {
					found = false;
					break;
				}

			if (!found)
				count++;
		}

		return count;
	}
}
