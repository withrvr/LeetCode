// stack class

// To Code : 15 min
// Execution : 2 ms

// Time complexity: O(n+m)
// Space complexity: O(n+m)

import java.util.Stack;

class Solution {
	public String helper(String str) {
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch != '#')
				stack.push(ch);
			else if (!stack.isEmpty())
				stack.pop();
		}

		return stack.toString();
	}

	public boolean backspaceCompare(String s, String t) {
		return helper(s).equals(helper(t));
	}
}
