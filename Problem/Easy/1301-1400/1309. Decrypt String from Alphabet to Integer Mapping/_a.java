class Solution {
	public String freqAlphabets(String s) {
		StringBuilder res = new StringBuilder();

		int i = s.length() - 1;

		while (i != -1) {
			if (s.charAt(i) == '#') {
				res.insert(0,
						(char) (Integer.parseInt(s.charAt(i - 2) + "" + s.charAt(i - 1)) + 96));
				i -= 3;
			} else {
				res.insert(0,
						(char) (Integer.parseInt(s.charAt(i--) + "") + 96));
			}
		}

		return new String(res);
	}
}
