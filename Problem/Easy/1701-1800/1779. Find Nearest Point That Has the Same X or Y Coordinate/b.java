// To Code : 30 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int nearestValidPoint(int x, int y, int[][] points) {
		int res = -1;
		int min_dis = Integer.MAX_VALUE;

		for (int i = 0; i < points.length; i++) {
			if (x == points[i][0] || y == points[i][1]) {
				int dis = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);

				if (dis < min_dis) {
					min_dis = dis;
					res = i;
				}
			}
		}

		return res;
	}
}
