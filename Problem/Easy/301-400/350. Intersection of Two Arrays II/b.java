// hashmap

// how many time a no. is repeated ... in arr1
// then check from arr2 .. the status

// Time: 2 ms // faster
// Time complexity: O(i+j)
// Space complexity: O(min(i, j))

import java.util.HashMap;
import java.util.ArrayList;

class Solution {
	public int[] intersect(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		// min size arr
		if (arr2.length < arr1.length) {
			int[] temp = arr1;
			arr1 = arr2;
			arr2 = temp;
		}

		// hm of arr1 ... no. repeated how many times
		for (int i : arr1) {
			hm.put(i, hm.getOrDefault(i, 0) + 1);
		}

		// check if there .. desc the repeat
		for (int j : arr2) {
			Integer repeated = hm.get(j);
			if (repeated != null && repeated > 0) { // was no there / no. more there
				list.add(j); // add in list
				hm.put(j, repeated - 1); // desc. 1 from hm
			}
		}

		// converting to int[]
		int[] result = new int[list.size()];
		for (int k = 0; k < list.size(); k++)
			result[k] = list.get(k);

		return result;
	}
};
