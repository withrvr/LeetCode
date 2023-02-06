class Solution {
	public boolean areAlmostEqual(String s1, String s2) {
		int diff = 0;
		char a, b;
		char last_a = '-', last_b = '-';

		for (int i = 0; i < s1.length(); i++) {
			a = s1.charAt(i);
			b = s2.charAt(i);

			if (a != b) {
				diff++;

				if (diff > 2 || (diff == 2 && !(a == last_b && b == last_a))) {
					return false;
				} else {
					last_a = a;
					last_b = b;
				}
			}
		}

		return diff == 1 ? false : true;
	}
}
