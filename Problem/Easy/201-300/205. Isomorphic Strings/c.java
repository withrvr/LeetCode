// 4 ms

class Solution {
	public boolean isIsomorphic(String s, String t) {
		char s_dict[] = new char[256];
		char t_dict[] = new char[256];

		for (int i = 0; i < s.length(); i++) {
			char ch_s = s.charAt(i);
			char ch_t = t.charAt(i);

			if (s_dict[ch_s] == 0 && t_dict[ch_t] == 0) {
				s_dict[ch_s] = ch_t;
				t_dict[ch_t] = ch_s;
			} else if (s_dict[ch_s] != ch_t)
				return false;
		}

		return true;
	}
}