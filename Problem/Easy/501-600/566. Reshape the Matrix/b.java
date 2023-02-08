// 1 for loop

// To Code : 20 min
// Execution : 0 ms

// Time complexity: O(n*m)
// Space complexity: O(1)

class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int x = mat.length, y = mat[0].length; // no of col in mat
		int count = x * y; // total no of row and col

		// not equal or same
		if ((r * c != count) || (r == x && c == y))
			return mat;

		int res[][] = new int[r][c];

		for (int i = 0; i < count; i++)
			res[i / c][i % c] = mat[i / y][i % y];

		return res;
	}
}
