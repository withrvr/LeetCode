// should be this
// => [1, 2, 4, 8, || 3, 5, 6, 9, || 7]

// Arrays.sort(input,(a,b)->Integer.bitCount(a)-Integer.bitCount(b));
// => [4, 8, 2, 1, || 6, 5, 9, 3, || 7]
// this will only order by bits only
// but larger number can come before it after sorting

// 11 ms
// lambda

import java.util.Arrays;

class Solution {
	public int[] sortByBits(int[] arr) {
		// convert -> Integer
		Integer[] input = Arrays.stream(arr).boxed().toArray(Integer[]::new);

		// main logic
		Arrays.sort(input, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b
				: Integer.bitCount(a) - Integer.bitCount(b));

		// convert -> int
		return Arrays.stream(input).mapToInt(Integer::intValue).toArray();
	}
}