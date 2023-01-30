// by leetcode

import java.util.Stack;

class Solution {
	public boolean backspaceCompare(String s, String t) {
		return build(s).equals(build(t));
	}

	public String build(String s) {
		Stack<Character> ans = new Stack<>();

		for (char c : s.toCharArray()) {
			if (c != '#')
				ans.push(c);
			else if (!ans.empty())
				ans.pop();
		}

		return String.valueOf(ans);
	}
}
