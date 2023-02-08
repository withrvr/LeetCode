// sorting

// Execution : 2 ms

// Time complexity: O(nlogn+nlogn +n) => O(nlogn)
// Space complexity: O(n+m)

import java.util.Arrays;

class Solution {
	public char findTheDifference(String s, String t) {
		char[] s_arr = s.toCharArray();
		char[] t_arr = t.toCharArray();

		Arrays.sort(s_arr);
		Arrays.sort(t_arr);

		int i;
		for (i = 0; i < s_arr.length; i++)
			if (s_arr[i] != t_arr[i])
				return t_arr[i];

		// if last element is the diff
		// since loop is for s_arr only
		// which is one less
		return t_arr[i];
	}
}