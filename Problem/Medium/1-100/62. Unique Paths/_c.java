// ternary operator
// and better memorization logic

class Solution {
	private int m, n;
	private int arr[][];

	public int uniquePaths(int m, int n) {
		arr = new int[m][n];

		this.m = m - 1;
		this.n = n - 1;

		return helper(0, 0);

		// int res = helper(0, 0);

		// for (int[] row : arr) {
		// for (int val : row) {
		// System.out.print(String.format("%4d ", val));
		// }
		// System.out.println();
		// }

		// return res;
	}

	private int helper(int x, int y) {
		if (arr[x][y] == 0) {
			if (x == m && y == n)
				return 1;

			arr[x][y] = x == m ? helper(x, y + 1) : y == n ? helper(x + 1, y) : helper(x + 1, y) + helper(x, y + 1);
		}

		return arr[x][y];
	}
}
