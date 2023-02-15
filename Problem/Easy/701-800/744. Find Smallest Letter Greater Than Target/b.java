// binary search

// To Code : 15 min
// Execution : 0 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		int low = 0, high = letters.length - 1, mid;

		while (low <= high) {
			mid = low + (high - low) / 2;

			// char val = letters[mid];
			// System.out.println(low + " : " + mid + " : " + high);

			if (letters[mid] <= target)
				low = mid + 1;
			else if (mid == 0 || letters[mid - 1] <= target)
				return letters[mid];
			else
				high = mid - 1;
		}

		return letters[0];
	}
}
