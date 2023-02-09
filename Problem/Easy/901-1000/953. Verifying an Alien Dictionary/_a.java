// short version ... a.java

import java.util.HashMap;

class Solution {
	public boolean isAlienSorted(String[] words, String order) {
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < order.length(); i++)
			hm.put(order.charAt(i), i);

		for (int i = 1; i < words.length; i++) {
			String a = words[i - 1];
			String b = words[i];

			int j = 0, k = 0;
			boolean mid_break = false;

			while (j < a.length() && k < b.length()) {
				Character a_ch = a.charAt(j++);
				Character b_ch = b.charAt(k++);

				if (a_ch != b_ch) {
					if (hm.get(a_ch) > hm.get(b_ch)) {

						return false;
					} else {
						mid_break = true;
						break;
					}
				}
			}

			if (mid_break == false && a.length() > b.length())
				return false;
		}

		return true;
	}
}
