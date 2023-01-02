// Stack

// b.java ... but using switch

// To Code : 5 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : s.toCharArray()) {
			switch (c) {
				case '(':
					stack.push(')');
					break;

				case '{':
					stack.push('}');
					break;

				case '[':
					stack.push(']');
					break;

				case ')':
				case '}':
				case ']':
					if (stack.isEmpty() || stack.pop() != c)
						return false;

					break;

				default:
					return false;
			}
		}

		return stack.isEmpty(); // if only push happens
	}
}