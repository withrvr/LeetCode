// reverse loop
// no need of to_add variable

// To Code : 15 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Arrays;

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[] = new int[] { 9, 9, 9, 9 };
		System.out.println("\nAns:- " + Arrays.toString(s.plusOne(arr)));
	}
}

class Solution {
	public int[] plusOne(int[] digits) {
		for (int i = digits.length - 1; i >= 0; i--) {
			System.out.println(String.format("%2d: %d", i, digits[i]));

			// can use this logic also
			// if (digits[i] < 9) {
			// digits[i]++;
			// return digits;
			// }
			// digits[i] = 0;

			if (++digits[i] == 10)
				digits[i] = 0;
			else
				return digits;
		}

		// // if it is coming here means come to first element
		// // no need array will create with default value of zero only
		// // and this will add to extra array zero only
		// for (int i = 1; i < digits.length; i++) {
		// extra[i] = digits[i - 1];
		// }

		int extra[] = new int[digits.length + 1];
		extra[0] = 1;
		return extra;
	}
}
