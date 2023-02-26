// recursion
// without visited
// but changing grid values

// To Code : 1 hr
// Execution : 2 ms

// Time complexity: O(n*m)
// Space complexity: O(1)

class Solution {
	char[][] grid;
	int rows, cols;

	public int numIslands(char[][] grid) {
		int count = 0;

		rows = grid.length;
		cols = grid[0].length;

		this.grid = grid;

		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				if (grid[i][j] == '1') {
					helper(i, j);
					count++;
				}

		return count;
	}

	// making `1` only visited ... and checking if its `0` or not
	public void helper(int x, int y) {
		if (grid[x][y] == '0')
			return;

		grid[x][y] = '0';

		if (x != 0)
			helper(x - 1, y);
		if (y != 0)
			helper(x, y - 1);
		if (x + 1 != rows)
			helper(x + 1, y);
		if (y + 1 != cols)
			helper(x, y + 1);
	}
}
