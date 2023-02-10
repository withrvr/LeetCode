// Comparator .... instead of lambda
// using Integer array
// 7 ms

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public int[] sortByBits(int[] arr) {
		// convert -> Integer
		Integer[] input = new Integer[arr.length];
		for (int i = 0; i < input.length; i++)
			input[i] = arr[i];

		// main logic
		Arrays.sort(input, new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				int a_bit = Integer.bitCount(a);
				int b_bit = Integer.bitCount(b);

				if (a_bit == b_bit)
					return a - b;

				return a_bit - b_bit;
			}
		});

		// convert -> int
		for (int i = 0; i < arr.length; i++)
			arr[i] = input[i];
		return arr;
	}
}
