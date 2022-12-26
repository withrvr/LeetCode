// double / nested iterations

// not recommend ... but one of the logic / solution
// but if other data type, like Integer, then using null as replacement, thats fine

// Time: 4 ms
// Time complexity: O(i*j)
// Space complexity: O(min(i, j))

import java.util.ArrayList;

class Solution {
	public int[] intersect(int[] arr1, int[] arr2) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) { // checking it same then adding in list
					list.add(arr1[i]);
					arr2[j] = -1;
					break;
				}
				// is able to do because no -ve no. will be there ... given in problem
				// making it -1/null/other number ... so next time if same number is check again
				// ... will ignore this ... so so the next same no. if there any
			}
		}

		// converting to int[]
		int[] result = new int[list.size()];
		for (int k = 0; k < list.size(); k++)
			result[k] = list.get(k);

		return result;
	}
};
