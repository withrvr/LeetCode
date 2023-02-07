// 💀
// don't work for
// [[0,0],[0,1],[0,-1]]

// but work for
// [[0,-1],[0,0],[0,1]]

// because: if points are not in order
// it don't work properly

// To Code : 10 min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public boolean checkStraightLine(int[][] points) {
		int diff_y = points[1][1] - points[0][1];
		int diff_x = points[1][0] - points[0][0];

		for (int i = 2; i < points.length; i++)
			if (((points[i][1] - points[i - 1][1]) != diff_y)
					||
					((points[i][0] - points[i - 1][0]) != diff_x))
				return false;

		return true;
	}
}
