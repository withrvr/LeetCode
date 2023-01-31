// To Code : 3 min
// Execution : TLE ms

// Time complexity: O(h-l)
// Space complexity: O(1)

class Solution {
	public int countOdds(int low, int high) {
		int count = 0;

		for (int i = low; i <= high; i++)
			if (i % 2 == 1)
				count++;

		return count;
	}
}
