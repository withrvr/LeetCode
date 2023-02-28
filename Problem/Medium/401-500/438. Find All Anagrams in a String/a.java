// brute force
// sub array check
// if element found

// To Code : 30 min
// Execution : TLE ms

// Time complexity: O(n + m*n)
// Space complexity: O(n)

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println("\nAns:- " + s.findAnagrams("cbaxxxbabcxxxx", "abc") + "\n");
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

		// System.out.println(hm.toString());

		for (int i = 0; i <= diff; i++) {
			Map<Character, Integer> subList = new HashMap<>(hm);
			int temp = i + n, j;

			for (j = i; j < temp; j++) {
				Character ch = s.charAt(j);
				subList.put(ch, subList.getOrDefault(ch, 0) - 1);
				if (subList.get(ch) == -1)
					break;
			}
			if (j == temp)
				res.add(i);
		}

		return res;
	}
}
