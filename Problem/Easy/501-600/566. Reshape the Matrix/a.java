// 2 for loop

// To Code : 30 min
// Execution : ? ms

// Time complexity: O(n*m)
// Space complexity: O(1)

class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int x = mat.length, y = mat[0].length;
		int count = x * y;

		if ((r * c != count) || (r == x && c == y))
			return mat;

		int res[][] = new int[r][c];

		// l: point col no
		// K: point row no

		for (int i = 0, k = 0, l = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				res[k][l] = mat[i][j];

				// l is greater than col len
				if (++l >= c) {
					k++; // this means shift to new row ... as all col is traverse
					l = 0; // make it 0 ... point to start
				}
			}
		}
		return res;
	}
}
