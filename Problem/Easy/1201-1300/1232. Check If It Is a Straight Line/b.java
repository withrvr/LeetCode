// LOGIC, Slope
// should be equal
// add work for any two points because its slope
// no need to be arrange in order

// dy/dx === curr_dy/curr_dx
// where curr_dy = y2 - y1
// and curr_dx = x2 - x1

//  dy     y1 - y0
// ---- = ---------
//  dx     x1 - x0

// dy/dx != curr_dy/curr_dx
// might through a run time error:division by 0
// thats why cross multiplication

// To Code : 10 min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public boolean checkStraightLine(int[][] point) {

		int dy = point[1][1] - point[0][1];
		int dx = point[1][0] - point[0][0];

		for (int i = 2; i < point.length; i++) {

			int curr_dy = point[i][1] - point[i - 1][1];
			int curr_dx = point[i][0] - point[i - 1][0];

			// dy/dx != curr_dy/curr_dx
			// might through a run time error:division by 0
			// thats why cross multiplication

			if (dy * curr_dx != dx * curr_dy)
				return false;
		}
		return true;
	}
}