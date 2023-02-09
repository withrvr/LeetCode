// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public String interpret(String s) {
		StringBuffer res = new StringBuffer();

		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == 'G') {
				res.append(s.charAt(i));
				i++;
			} else if (s.charAt(i) == '(' && s.charAt(i + 1) == ')') {
				res.append('o');
				i += 2;
			} else {
				res.append("al");
				i += 4;
			}
		}

		return res.toString();
	}
}