// useless solution

import java.util.Arrays;

// -`[3,6,2,3]`*** imp case

// ========> no sorting

// To Code : 15 min
// Execution : TLE ms ... for last case

// Time complexity: O(n^3)
// Space complexity: O(1)

class Solution {
	public int largestPerimeter(int[] nums) {
		int n = nums.length, _z, _x, _y, max = 0;

		for (int z = 0; z < n - 2; z++) {
			_z = nums[z];

			for (int x = z + 1; x < n - 1; x++) {
				_x = nums[x];

				for (int y = x + 1; y < n; y++) {
					_y = nums[y];

					// lg from 3 num
					// and
					// lg < sm + md ... other 2

					int p[] = new int[] { _x, _y, _z };
					Arrays.sort(p);

					if (p[2] < p[1] + p[0])
						max = Math.max(max, _z + _x + _y);

					// if (
					// (_z > _x && _z > _y && _z < _x + _y) ||
					// (_x > _y && _x > _z && _x < _z + _y) ||
					// (_y > _x && _y > _z && _y < _x + _z)
					// )
					// max = Math.max(max, _z + _x + _y);
				}
			}
		}

		return max;
	}
}
