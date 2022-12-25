// sets

// make arr1 as set1
// check which arr2 element in set1
// ie. element which is common

// NOTE: remove that ele from set1
// because if arr2 contain more same ele
// it will count it again ... but the intersection has been noted

import java.util.ArrayList;
import java.util.HashSet;

class Solution {
	public int[] intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();

		for (int ele : arr1)
			set1.add(ele);

		for (int ele : arr2) {
			if (set1.contains(ele)) {
				System.out.print(ele + ", ");

				set1.remove(ele);
				result.add(ele);
			}
		}

		return result.stream().mapToInt(Integer::intValue).toArray();
	}
};
