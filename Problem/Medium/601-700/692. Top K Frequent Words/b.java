// heap
// 5 ms

// Time Complexity: O(nlogn + Klogn) = O(nlogn)
// Space Complexity: O(n), for heap

import java.util.*;

class Solution {
	public List<String> topKFrequent(String[] words, int k) {

		// adding to hash map ... to count
		Map<String, Integer> map = new HashMap<>();
		for (String word : words)
			map.put(word, map.getOrDefault(word, 0) + 1);

		// using heap to sort on insert
		PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(new MyComparator());
		for (Map.Entry<String, Integer> e : map.entrySet())
			pq.offer(e);

		// res: starting k list element
		List<String> ans = new ArrayList<>();
		for (int i = 0; i < k; i++)
			ans.add(pq.poll().getKey());

		return ans;
	}
}

class MyComparator implements Comparator<Map.Entry<String, Integer>> {
	public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
		int val = e2.getValue().compareTo(e1.getValue());

		if (val == 0)
			return e1.getKey().compareTo(e2.getKey());

		return val;
	}
}

// can do this also

// PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>(
// (a,b) -> a.getValue()==b.getValue() ? b.getKey().compareTo(a.getKey()) :
// a.getValue()-b.getValue()
// );

// class MyComparator implements Comparator<Map.Entry<String, Integer>> {
// public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer>
// e2) {
// String word1 = e1.getKey();
// int freq1 = e1.getValue();
// String word2 = e2.getKey();
// int freq2 = e2.getValue();
// if (freq1 != freq2) {
// return freq2 - freq1;
// } else {
// return word1.compareTo(word2);
// }
// }
// }
