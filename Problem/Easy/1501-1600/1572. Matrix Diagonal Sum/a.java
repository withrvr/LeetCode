// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int diagonalSum(int[][] mat) {
		int res = 0, j = mat.length;

		for (int i = 0; i < mat.length; i++) {
			res += mat[i][i];
			res += mat[--j][i];
		}

		return mat.length % 2 == 0 ? res : res - mat[mat.length / 2][mat.length / 2];
	}
}
