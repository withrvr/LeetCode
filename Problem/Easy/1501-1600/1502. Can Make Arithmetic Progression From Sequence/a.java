// To Code : 3 min
// Execution : 2 ms

// Time complexity: O(n) + sort
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public boolean canMakeArithmeticProgression(int[] arr) {
		Arrays.sort(arr);
		int diff = arr[1] - arr[0];

		for (int i = 2; i < arr.length; i++)
			if (arr[i] - arr[i - 1] != diff)
				return false;

		return true;
	}
}
