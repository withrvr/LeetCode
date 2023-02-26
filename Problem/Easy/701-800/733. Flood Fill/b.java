// 0 ms

// no need of visited as its value will be changed ... if its visited
// also ... checking valid index before only

class Solution {
	int old_color, new_color;
	int[][] image;

	public int[][] floodFill(int[][] image, int sr, int sc, int new_color) {
		old_color = image[sr][sc];

		if (old_color != new_color) {
			this.new_color = new_color;
			this.image = image;

			dfs(sr, sc);
		}

		return image;
	}

	public void dfs(int x, int y) {
		if (image[x][y] != old_color)
			return;

		image[x][y] = new_color;

		if (x > 0)
			dfs(x - 1, y);
		if (y > 0)
			dfs(x, y - 1);
		if (x + 1 < image.length)
			dfs(x + 1, y);
		if (y + 1 < image[0].length)
			dfs(x, y + 1);
	}
}
