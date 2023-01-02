// Stack

// push: adding opposite parentheses
// pop:  if last one is that push parentheses only

// To Code : 5 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			// push
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			// pop ... checking if pop ele is what it was meant was
			else if (stack.isEmpty() || stack.pop() != c)
				return false;
		}

		return stack.isEmpty(); // if only push happens
	}
}