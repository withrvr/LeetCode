// no need of k in logic
// can use j only like other

// To Code : ? min
// Execution : ? ms

// Time complexity: O(n*log(n))
// Space complexity: O(n)

import java.util.HashMap;

class Solution {
	public boolean isAlienSorted(String[] words, String order) {
		// hm: of order
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < order.length(); i++)
			hm.put(order.charAt(i), i);

		// logic
		for (int i = 1; i < words.length; i++) {
			System.out.println("i: " + i);
			String a = words[i - 1]; // before it .. first
			String b = words[i]; // current ... second

			int j = 0, k = 0;
			boolean mid_break = false;

			while (j < a.length() && k < b.length()) {
				Character a_ch = a.charAt(j++);
				Character b_ch = b.charAt(k++);

				System.out.println(" --> " + a_ch + " : " + b_ch);

				if (a_ch != b_ch) {
					if (hm.get(a_ch) > hm.get(b_ch)) {
						System.out.println("second Char is greater");
						return false;
					} else {
						// System.out.println(".");
						mid_break = true;
						break;
					}
				}
			}

			// if not break,
			// means staring string is fully same
			// in this case
			// first work should be small
			// ex: apple, app ... false
			if (mid_break == false && a.length() > b.length()) {
				System.out.println("first > second");
				return false;
			}

			System.out.println();
		}

		return true;
	}
}
