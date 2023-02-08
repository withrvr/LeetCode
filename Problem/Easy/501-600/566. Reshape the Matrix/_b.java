class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int x = mat.length, y = mat[0].length;
		int count = x * y;

		if ((r * c != count) || (r == x && c == y))
			return mat;

		int res[][] = new int[r][c];

		for (int i = 0; i < count; i++)
			res[i / c][i % c] = mat[i / y][i % y];

		return res;
	}
}
