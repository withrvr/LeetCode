// Stack

// same as a.java
// but using switch

// also save more memory

// To Code : 15 min
// Execution : 1 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (Character c : s.toCharArray()) {
			switch (c) {
				case '(':
				case '{':
				case '[':
					stack.push(c);
					break;

				case ')':
					if (stack.isEmpty() || stack.pop() != '(')
						return false;
					break;

				case '}':
					if (stack.isEmpty() || stack.pop() != '{')
						return false;
					break;

				case ']':
					if (stack.isEmpty() || stack.pop() != '[')
						return false;
					break;

				default:
					return false;
			}
		}

		return stack.empty(); // in case only push happens
	}
}
