// build in string methods
// replace, reverse

// regex \\W+ .... contain '_' also
// [^a-z0-9] is best

// To Code : 5 min
// Execution : 17 ms

// Time complexity: O(?)
// Space complexity: O(n)

class Solution {
	public boolean isPalindrome(String s) {

		// Short Version
		s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
		return s.equals(new StringBuilder(s).reverse().toString());

		// // Long Version
		// s = s.toLowerCase();
		// s = s.replaceAll("[^a-z0-9]", "");

		// StringBuilder s1 = new StringBuilder(s);
		// s1.reverse();

		// if (s.equals(s1.toString()))
		// return true;
		// else
		// return false;
	}
}
