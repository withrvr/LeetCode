// making 0 the row and col
// val as 1

// so no need to check condition in loop

class Solution {
	public int uniquePaths(int m, int n) {
		int[][] grid = new int[m][n];

		grid[0][0] = 1;

		for (int i = 1; i < m; i++)
			grid[i][0] = 1;

		for (int j = 1; j < n; j++)
			grid[0][j] = 1;

		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				grid[i][j] = grid[i - 1][j] + grid[i][j - 1];

		return grid[m - 1][n - 1];
	}
}
