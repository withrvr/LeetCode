class Solution {
	public boolean isIsomorphic(String s, String t) {
		char st[] = new char[256];
		char ts[] = new char[256];

		for (int i = 0; i < s.length(); i++) {
			char sc = s.charAt(i);
			char tc = t.charAt(i);

			if (st[sc] == 0 && ts[tc] == 0) {
				st[sc] = tc;
				ts[tc] = sc;
			} else if (st[sc] != tc)
				return false;
		}

		return true;
	}
}