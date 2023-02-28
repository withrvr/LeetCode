// sliding window

// To Code : 1 hr
// Execution : 86 ms

// Time complexity: O(n + m)
// Space complexity: O(n)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("\nAns:- " + s.findAnagrams("cbabacxxxcbabacd", "aabbc") + "\n");
	}
}

class Solution {
	public List<Integer> findAnagrams(String s, String p) {
		int m = s.length(), n = p.length(), diff = m - n;
		List<Integer> res = new ArrayList<>();

		if (diff < 0)
			return res;

		Map<Character, Integer> hm = new HashMap<>();

		for (Character val : p.toCharArray())
			hm.put(val, hm.getOrDefault(val, 0) + 1);

		// System.out.println(m);
		// System.out.println(n);
		// System.out.println(hm.toString());

		Map<Character, Integer> subList = new HashMap<>();

		// adding starting element
		for (int i = 0; i < n; i++) {
			Character ch = s.charAt(i);
			subList.put(ch, subList.getOrDefault(ch, 0) + 1);
		}

		// main logic
		// checking and removing / adding
		for (int left = 0, right = n; right < m; left++, right++) {
			// System.out.println(left + " - " + right);

			// check
			if (hm.equals(subList))
				res.add(left);

			Character l_ch = s.charAt(left);
			subList.put(l_ch, subList.get(l_ch) - 1);
			if (subList.get(l_ch) == 0)
				subList.remove(l_ch);

			Character r_ch = s.charAt(right);
			subList.put(r_ch, subList.getOrDefault(r_ch, 0) + 1);
		}

		// check for last condition
		// here diff value will be last left value
		if (hm.equals(subList))
			res.add(diff);

		return res;
	}
}
