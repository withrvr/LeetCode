// stack
// using char array

// To Code : 15 min
// Execution : 0 ms

// Time complexity: O(n+m)
// Space complexity: O(n+m)

class Solution {
	public static boolean backspaceCompare(String k1, String k2) {
		return helper(k1).equals(helper(k2));
	}

	public static String helper(String k) {
		char[] a = new char[k.length()];
		int i = 0;

		for (int j = 0; j < k.length(); j++) {
			char c = k.charAt(j);
			if (c != '#')
				a[i++] = c;
			else if (i > 0)
				i--;
		}

		return String.valueOf(a).substring(0, i);
	}
}