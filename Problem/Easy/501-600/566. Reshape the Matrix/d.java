// creating the que the adding it to new array

// To Code : 10 min
// Execution : 2 ms

// Time complexity: O(n*m) + O(n*m) => O(n*m)
// Space complexity: O(n*m)

import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int[][] matrixReshape(int[][] mat, int r, int c) {
		int x = mat.length, y = mat[0].length;
		int count = x * y;

		if ((r * c != count) || (r == x && c == y))
			return mat;

		// adding all element in que
		Queue<Integer> que = new LinkedList<>();
		for (int[] row : mat)
			for (int col : row)
				que.add(col);

		// now adding it to res ... from queue
		int res[][] = new int[r][c];
		for (int i = 0; i < r; i++)
			for (int j = 0; j < c; j++)
				res[i][j] = que.remove();

		return res;
	}
}