// reverse loop

// To Code : 30 min
// Execution : 6ms ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public String freqAlphabets(String s) {
		StringBuilder res = new StringBuilder();

		int i = s.length() - 1, num;

		while (i != -1) {
			if (s.charAt(i) == '#') {
				num = Integer.parseInt(s.charAt(i - 2) + "" + s.charAt(i - 1));
				i -= 3;
			} else {
				num = Integer.parseInt(s.charAt(i) + "");
				i--;
			}
			res.insert(0, (char) (num + 96));

			// System.out.println(String.format("%d : %c --> %d", i, res.charAt(0), num));
		}

		// return res.toString(); // not working no idea
		return new String(res);
	}
}
