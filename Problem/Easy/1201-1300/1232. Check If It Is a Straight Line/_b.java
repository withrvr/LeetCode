class Solution {
	public boolean checkStraightLine(int[][] point) {
		int dy = point[1][1] - point[0][1];
		int dx = point[1][0] - point[0][0];

		for (int i = 2; i < point.length; i++)
			if ((dy * (point[i][0] - point[i - 1][0])) != (dx * (point[i][1] - point[i - 1][1])))
				return false;

		return true;
	}
}
