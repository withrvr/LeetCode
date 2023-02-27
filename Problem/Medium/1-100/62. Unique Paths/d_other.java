// iterate
class Solu2342tion {
	public int uniquePaths(int m, int n) {
		int[][] f = new int[m][n];
		for (int i = 0; i < m; i++)
			f[i][0] = 1;
		for (int j = 0; j < n; j++)
			f[0][j] = 1;
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				f[i][j] = f[i - 1][j] + f[i][j - 1];
		return f[m - 1][n - 1];
	}
}

class asdf {
	public int uniquePaths(int m, int n) {
		int[][] grid = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == 0)
					grid[0][j] = 1;
				if (j == 0)
					grid[i][0] = 1;
				if (i != 0 && j != 0) {
					int up = grid[i - 1][j];
					int left = grid[i][j - 1];
					grid[i][j] = up + left;
				}
			}
		}
		return grid[n - 1][m - 1];
	}
}