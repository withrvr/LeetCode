// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

// inc ... i .. in if only

class Solution {
	public String interpret(String s) {
		StringBuffer res = new StringBuffer();

		int i = 0;

		while (i < s.length()) {
			if (s.charAt(i) == 'G')
				res.append(s.charAt(i++));
			else if (s.charAt(i++) == '(' && s.charAt(i++) == ')')
				res.append('o');
			else {
				res.append("al");
				i += 2;
				// NOTE: this is IMP
				// because out of +4 ... +2 ... happened above
			}

			System.out.println(i);
		}

		return res.toString();
	}
}