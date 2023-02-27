// more faster and efficient than a.java

// TLE ---> for 51 x 9
// 41/63 test cases passed

// store decreased m, n value
// return 1 if found

// not going to path ... with out of index ..... no need of return 0

// Time complexity: O(m*n)
// Space complexity: O(m*n) .... recursion space
// * more .... because no memorization

class Solution {
	private int m, n;

	public int uniquePaths(int m, int n) {
		this.m = m - 1;
		this.n = n - 1;

		return helper(0, 0);
	}

	private int helper(int x, int y) {
		if (x == m && y == n)
			return 1;

		if (x == m)
			return helper(x, y + 1);
		if (y == n)
			return helper(x + 1, y);

		return helper(x + 1, y) + helper(x, y + 1);
	}
}
