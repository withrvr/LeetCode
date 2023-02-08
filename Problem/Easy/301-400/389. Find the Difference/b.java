// since eng small char only
// +97
// -97
// to point the arr index

// To Code : 3 min
// Execution : 1 ms

// Time complexity: O(n+n) => O(n)
// Space complexity: O(26+26) => O(1)

class Solution {
	public char findTheDifference(String s, String t) {
		int s_count[] = new int[26];
		int t_count[] = new int[26];

		int i;
		for (i = 0; i < s.length(); i++) {
			s_count[s.charAt(i) - 97]++;
			t_count[t.charAt(i) - 97]++;
		}

		// since one extra in t
		t_count[t.charAt(i) - 97]++;

		for (i = 0; i < s_count.length; i++)
			if (s_count[i] != t_count[i])
				return (char) (i + 97);

		// will not come then also
		return '?';
	}
}
