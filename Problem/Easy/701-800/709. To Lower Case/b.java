
// To Code : 3 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(n)

class Solution {
	public String toLowerCase(String s) {
		char s_arr[] = s.toCharArray();

		for (int i = 0; i < s_arr.length; i++) {
			// if ('A' <= a[i] && a[i] <= 'Z')
			if (s_arr[i] >= 'A' && s_arr[i] <= 'Z') {

				// System.out.println(s_arr[i] + " : " + (int) s_arr[i]);
				// s_arr[i] = (chs_arrr) (a[i] - 'A' + 'a');
				// s_arr[i] = (char) (s_arr[i] + 32);
				s_arr[i] += 32;
			}
		}
		return new String(s_arr);
		// return s_arr.toString(); // ... not working no idea\
	}
}
