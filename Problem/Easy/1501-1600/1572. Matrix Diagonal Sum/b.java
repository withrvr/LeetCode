// without extra variable
// n-i-1

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int diagonalSum(int[][] mat) {
		int res = 0;

		for (int i = 0; i < mat.length; i++)
			res += mat[i][i] + mat[mat.length - i - 1][i];

		return mat.length % 2 == 0 ? res : res - mat[mat.length / 2][mat.length / 2];
	}
}
