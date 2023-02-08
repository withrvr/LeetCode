// which is larger / smaller
// loop will small len
// then find substring from large

// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(max(m, n)) ==> O(n)
// Space complexity: O(1) ... constant space to return res

class Solution {
	public String mergeAlternately(String word1, String word2) {
		// int a = word1.length(), b = word2.length();

		StringBuffer res = new StringBuffer();
		String small, large;

		// small/large will only point ... will not take extra space
		if (word1.length() < word2.length()) {
			small = word1;
			large = word2;
		} else {
			small = word2;
			large = word1;
		}

		// small len ... loop
		for (int i = 0; i < small.length(); i++) {
			res.append(word1.charAt(i));
			res.append(word2.charAt(i));
		}

		// remaining from the .. large string
		res.append(large.substring(small.length()));

		return res.toString();
	}
}
