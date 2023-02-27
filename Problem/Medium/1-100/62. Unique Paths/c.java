// recursion using memorization

// To Code : 1 hr
// Execution : 0 ms

// Time complexity: O(m*n) ... recursion
// Space complexity: O(m*n) ... memorization

class Solution {
	private int m, n;
	private int arr[][];

	public int uniquePaths(int m, int n) {
		arr = new int[m][n];

		this.m = m - 1;
		this.n = n - 1;

		return helper(0, 0);
	}

	private int helper(int x, int y) {
		if (arr[x][y] != 0)
			return arr[x][y];

		if (x == m && y == n)
			return 1;

		if (x == m)
			arr[x][y] = helper(x, y + 1);
		else if (y == n)
			arr[x][y] = helper(x + 1, y);
		else
			arr[x][y] = helper(x + 1, y) + helper(x, y + 1);

		return arr[x][y];
	}
}
