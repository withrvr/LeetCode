// shorting

// tc: O( n^2 log(n) )
// sc: O(1)

// 1 ms

import java.util.Arrays;

class Solution {
	public static int lastStoneWeight(int[] stones) {
		Arrays.sort(stones);

		for (int i = stones.length - 1; i > 0; i--) {
			stones[i - 1] = stones[i] - stones[i - 1];
			Arrays.sort(stones);
		}

		return stones[0];
	}
}
