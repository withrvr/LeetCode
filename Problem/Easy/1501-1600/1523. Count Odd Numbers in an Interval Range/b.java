// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(1)
// Space complexity: O(1)

// NOTE: () ... Brackets are IMP

class Solution {
	public int countOdds(int low, int high) {
		// if low and high are even
		if (low % 2 == 0 && high % 2 == 0)
			return (high - low) / 2;

		// else for any other case
		return ((high - low) / 2) + 1;
	}
}
