// sort, 2 pointers

// proper explanation of logic: https://leetcode.com/problems/intersection-of-two-arrays-ii/solutions/954800/java-solution-with-explanation-and-pictures/

// Time: 2 ms
// Time complexity: sorting + O(n+m)
// Space complexity: O(1) ..... // but O(min(n, m)) for list ... which is not counted

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
	public int[] intersect(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int top = 0, bottom = 0;

		while (top < arr1.length && bottom < arr2.length) {

			if (arr1[top] < arr2[bottom]) {
				top++;
			} else if (arr2[bottom] < arr1[top]) {
				bottom++;
			} else { // arr1[top] == arr2[bottom]
				list.add(arr1[top]);
				top++;
				bottom++;
			}
		}

		// converting to int[]
		int[] result = new int[list.size()];
		for (int k = 0; k < list.size(); k++)
			result[k] = list.get(k);

		return result;
	}
};
