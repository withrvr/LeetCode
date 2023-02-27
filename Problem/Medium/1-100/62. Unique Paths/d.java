// NOTE: .... we are using reverse approach here
// uncomment and trying running using print statement

// iterate

// Time complexity: O(m*n) ... loop
// Space complexity: O(m*n) ... for grid

// no extra space taken here .... because no recursion tree

class Solution {
	public int uniquePaths(int m, int n) {
		int[][] grid = new int[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || j == 0)
					grid[i][j] = 1;
				else
					grid[i][j] = grid[i - 1][j] + grid[i][j - 1];

				System.out.print(String.format("%4d ", grid[i][j]));
			}
			System.out.println();
		}

		return grid[m - 1][n - 1];
	}
}
