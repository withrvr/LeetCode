// using arrays as hashmap

// 9 ms

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

class Solution {
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> result = new ArrayList<>();
		int m = s.length(), n = p.length();

		if (m < n)
			return result;

		int[] sCount = new int[26];
		int[] pCount = new int[26];

		for (int i = 0; i < n; i++) {
			sCount[s.charAt(i) - 'a']++;
			pCount[p.charAt(i) - 'a']++;
		}

		if (Arrays.equals(sCount, pCount))
			result.add(0);

		for (int left = 0, right = n; right < m; right++) {
			sCount[s.charAt(left) - 'a']--;
			sCount[s.charAt(right) - 'a']++;

			left++;
			if (Arrays.equals(sCount, pCount))
				result.add(left);
		}

		return result;
	}

	// // Arrays.equals(sCount, pCount)
	// private boolean compare_array(int[] pHash, int[] sHash) {
	// for (int idx = 0; idx < 26; idx++)
	// if (pHash[idx] != sHash[idx])
	// return false;

	// return true;
	// }
}
