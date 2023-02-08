// To Code : 30 min
// Execution : 2 ms

// Time complexity: O(n + n) => O(n)
// Space complexity: O(1)

class Solution {
	public int nearestValidPoint(int x, int y, int[][] points) {
		int min_dis = Integer.MAX_VALUE;

		for (int[] point : points) {
			if (x == point[0] || y == point[1])
				min_dis = Math.min(min_dis, Math.abs(x - point[0]) + Math.abs(y - point[1]));
		}

		for (int i = 0; i < points.length; i++)
			if ((x == points[i][0] || y == points[i][1])
					&& (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]) == min_dis))
				return i;

		return -1;
	}
}
