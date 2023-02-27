// recursion
// if found then 1 ... else 0

// To Code : 1 hr
// Execution : TLE ms ---> for 19 x 13

// 38 / 63 test cases passed

// Time complexity: O((m+1)*(n+1))
// Space complexity: O(m*n) .... recursion space
// * more .... because no memorization

class Solution {
	private int m, n;

	public int uniquePaths(int m, int n) {
		this.m = m;
		this.n = n;

		return helper(0, 0);
	}

	private int helper(int x, int y) {
		if (x == m - 1 && y == n - 1)
			return 1;

		if (x == m || y == n)
			return 0;

		return helper(x + 1, y) + helper(x, y + 1);
	}
}
