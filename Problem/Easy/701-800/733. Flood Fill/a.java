// recursion
// visited

// To Code : 30 min
// Execution : 1 ms

// Time complexity: O(m*n)
// Space complexity: O(m*n) ... in boolean ... for visited

class Solution {
	int old_color, new_color, m, n;
	boolean visited[][];
	int[][] image;

	public int[][] floodFill(int[][] image, int sr, int sc, int new_color) {
		if (image[sr][sc] == new_color)
			return image;

		this.m = image.length;
		this.n = image[0].length;
		this.image = image;

		this.visited = new boolean[this.m][this.n];

		this.old_color = image[sr][sc];
		this.new_color = new_color;

		helper(sr, sc);

		return image;
	}

	public void helper(int x, int y) {
		// out of bound / visited
		if (x < 0 || x >= m || y < 0 || y >= n || visited[x][y] == true)
			return;

		visited[x][y] = true;

		if (image[x][y] != old_color)
			return;

		image[x][y] = new_color;

		helper(x + 1, y);
		helper(x - 1, y);
		helper(x, y + 1);
		helper(x, y - 1);

	}
}
