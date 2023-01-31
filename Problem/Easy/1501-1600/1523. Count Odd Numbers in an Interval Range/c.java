// To Code : 10 min
// Execution : 0 ms

// Time complexity: O(h-l)
// Space complexity: O(1)

// NOTE: () ... Brackets are IMP

// making low and high
// both odd
// because we know if l and h ... both is odd

// work for 6-6 also
// => ((5-7)/2) + 1
// => (-2/2) + 1
// => -1 + 1
// => 0

class Solution {
	public int countOdds(int low, int high) {
		if (low % 2 == 0)
			low++;

		if (high % 2 == 0)
			high--;

		return ((high - low) / 2) + 1;
	}
}