// using Integer array
// and lambda
// 7 ms

import java.util.Arrays;

class Solution {
	public int[] sortByBits(int[] arr) {
		// convert -> Integer
		Integer[] input = new Integer[arr.length];
		for (int i = 0; i < input.length; i++)
			input[i] = arr[i];

		// main logic
		Arrays.sort(input,
				(a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b
						: Integer.bitCount(a) - Integer.bitCount(b));

		// convert -> int
		for (int i = 0; i < arr.length; i++)
			arr[i] = input[i];
		return arr;
	}
}