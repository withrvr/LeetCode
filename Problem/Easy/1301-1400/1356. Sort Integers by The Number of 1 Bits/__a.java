// using arraylist
// and lambda
// 8 ms

import java.util.ArrayList;
import java.util.Collections;

// Same Approach :) (Easier to Understand)
class Solution {
	public int[] sortByBits(int[] arr) {
		// convert -> Integer
		ArrayList<Integer> al = new ArrayList<>();
		for (int i : arr)
			al.add(i);

		Collections.sort(al, (a, b) -> Integer.bitCount(a) == Integer.bitCount(b) ? a - b
				: Integer.bitCount(a) - Integer.bitCount(b));

		// convert -> int
		for (int i = 0; i < arr.length; i++)
			arr[i] = al.get(i);
		return arr;
	}
}

// public int[] sortByBits(int[] arr) {
// Arrays.sort(arr, new Comparator<>() {
// public int compare(int a, int b) {
// if(Integer.bitCount(a) == Integer.bitCount(b)) {
// return a - b;
// } else {
// return Integer.bitCount(a) - Integer.bitCount(b);
// }
// }
// });
// return arr;
// }