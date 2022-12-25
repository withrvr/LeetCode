// sets
// build it method for intersection ... retainAll

import java.util.HashSet;

class Solution {
	public int[] intersection(int[] arr1, int[] arr2) {
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

		for (int ele : arr1)
			set1.add(ele);

		for (int ele : arr2)
			set2.add(ele);

		System.out.println("BEFORE: ");
		System.out.println("set1: " + set1.toString());
		System.out.println("set2: " + set2.toString());

		set1.retainAll(set2);
		// ie. set1 becomes .. intersection

		System.out.println("AFTER: ");
		System.out.println("set1: " + set1.toString());
		System.out.println("set2: " + set2.toString());

		return set1.stream().mapToInt(Integer::intValue).toArray();
	}
};
