class Solution {
	public boolean areAlmostEqual(String s1, String s2) {
		// keep track of found differences
		int first = -1;
		int second = -1;

		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (first == -1) {
					first = i;
				} else if (second == -1) {
					second = i;
				} else {
					// found more than two differences
					return false;
				}
			}
		}

		// in case only no difference encounter
		// ie string are same
		if (first == -1) {
			return true;
		}

		// in case only 1 diff encounter
		// special case
		// "aa"
		// "ac"
		if (second == -1) {
			return false;
		}

		// if differences are equal in cross then strings would become equal
		return s1.charAt(first) == s2.charAt(second) &&
				s1.charAt(second) == s2.charAt(first);
	}
}
