// hashmap, sort

// To Code : 30 min
// Execution : 11 ms

// Time complexity: O(n + nlogn + k) -> O(nlogn)
// Space complexity: O(n + n + k) ---> O(n)

import java.util.*;

class Solution {
	public List<String> topKFrequent(String[] words, int k) {
		HashMap<String, Integer> map = new HashMap<>();

		// adding to hash map
		for (String val : words)
			map.put(val, map.getOrDefault(val, 0) + 1);

		// System.out.println(map.toString());

		// sorted list of hashmap ... in high count ie. desc order .... then in word in
		// lexicographical order ie. asc
		List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
				int val = o2.getValue().compareTo(o1.getValue());

				if (val == 0)
					return o1.getKey().compareTo(o2.getKey());

				return val;
			}
		});

		// System.out.println(list.toString());

		// k element of list
		List<String> res = new ArrayList<>();
		for (int i = 0; i < k; i++)
			res.add(list.get(i).getKey());

		return res;
	}
}