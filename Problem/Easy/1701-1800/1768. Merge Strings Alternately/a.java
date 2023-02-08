// 💀: cant do this as ... word1 should be word1

// word1 as large string always
// loop will small len ... ie. word2
// then find substring from word1 and return

// To Code : 10 min
// Execution : ? ms

// Time complexity: O(max(m, n)) ==> O(n)
// Space complexity: O(1) ... constant space to return res

class Solution {
	public String mergeAlternately(String word1, String word2) {
		// int a = word1.length(), b = word2.length();

		StringBuffer res = new StringBuffer();

		// means word1 will always be larger
		if (word1.length() < word2.length()) {
			String temp = word1;
			word1 = word2;
			word2 = temp;
		}

		// small len ... loop
		for (int i = 0; i < word2.length(); i++) {
			res.append(word1.charAt(i));
			res.append(word2.charAt(i));
		}

		res.append(word1.substring(word2.length()));

		return res.toString();
	}
}
