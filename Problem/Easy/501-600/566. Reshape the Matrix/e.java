// combination of a & b

class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int x = mat.length, y = mat[0].length;
		int count = x * y;

		if ((r * c != count) || (r == x && c == y))
			return mat;

		int res[][] = new int[r][c];

		count = 0; // *** track the length

		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				res[count / c][count++ % c] = mat[i][j]; // *** count++

		return res;
	}
}
