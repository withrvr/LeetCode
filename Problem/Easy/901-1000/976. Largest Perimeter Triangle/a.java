// brute force
// sort

// don't use it

// To Code : 15 min

// Execution : TLE ms ... for last case

// Time complexity: O(n^3)
// Space complexity: O(1)

import java.util.Arrays;

class Solution {
	public int largestPerimeter(int[] nums) {
		int n = nums.length;
		Arrays.sort(nums);

		for (int z = n - 1; z >= 2; z--) {
			int _z = nums[z];

			for (int x = z - 1; x >= 1; x--) {
				int _x = nums[x];

				for (int y = x - 1; y >= 0; y--) {
					int _y = nums[y];

					if (_z < _x + _y) {
						// first largest possible triangle
						return _z + _x + _y;
					}
				}
			}
		}

		return 0;
	}
}