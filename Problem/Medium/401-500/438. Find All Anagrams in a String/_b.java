// sliding window
// more better than b ... improved version

// To Code : 1 hr
// Execution : 84 ms

// Time complexity: O(n + m)
// Space complexity: O(n)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println("\nAns:- " + s.findAnagrams("cbabacxxxcbabacd", "aabbc") +
		// "\n");
		System.out.println("\nAns:- " + s.findAnagrams("baa", "aa") + "\n");
	}
}

class Solution {
	public List<Integer> findAnagrams(String s, String p) {
		int m = s.length(), n = p.length();
		List<Integer> res = new ArrayList<>();

		if (m < n)
			return res;

		Map<Character, Integer> subList = new HashMap<>();
		Map<Character, Integer> hm = new HashMap<>();

		// System.out.println(m);
		// System.out.println(n);
		// System.out.println(hm.toString());

		for (int i = 0; i < n; i++) {
			// adding starting element
			Character ch_s = s.charAt(i);
			subList.put(ch_s, subList.getOrDefault(ch_s, 0) + 1);

			// hash map for p
			// map hm: to check
			Character ch_p = p.charAt(i);
			hm.put(ch_p, hm.getOrDefault(ch_p, 0) + 1);
		}

		// for very first just created hash map
		if (hm.equals(subList))
			res.add(0);

		// --- main logic ---
		// checking and removing / adding
		for (int left = 0, right = n; right < m; right++) {
			// System.out.println(left + " - " + right);

			// remove left side
			Character l_ch = s.charAt(left);
			subList.put(l_ch, subList.get(l_ch) - 1);
			if (subList.get(l_ch) == 0)
				subList.remove(l_ch);

			// add right side
			Character r_ch = s.charAt(right);
			subList.put(r_ch, subList.getOrDefault(r_ch, 0) + 1);

			// NOTE: imp .... using left++ ... here
			left++;

			// check
			if (hm.equals(subList))
				res.add(left);
		}

		return res;
	}
}
