// difficult to come up with
// 2 ms

// https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/solutions/2715364/simple-java-solution-easy-to-understand/
// since given 10000 ... is the max number

import java.util.Arrays;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		// arr = new int[] { 33 };
		arr = new int[] { 1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1, 8, 8 };
		arr = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8 };

		// System.out.println("\nAns:- " + Arrays.toString(arr) + "\n");
		System.out.println("\nAns:- " + s.sortByBits(arr) + "\n");
	}
}

class Solution {
	public int[] sortByBits(int[] arr) {

		// 10001 ... can be any number ....but should be the biggest + 1 from all the
		// number
		// since in question given .... 1000 is the best in array

		// logic
		// num + (n.of.bits * 10001)

		for (int i = 0; i < arr.length; i++) {
			System.out.println(String.format("%d: %d --> %d", i, arr[i], Integer.bitCount(arr[i])));
			arr[i] += Integer.bitCount(arr[i]) * 10001;
		}

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		// making it normal number again
		for (int i = 0; i < arr.length; i++) {
			arr[i] %= 10001;
		}

		System.out.println(Arrays.toString(arr));

		return arr;
	}
}