// Stack

// better a.java
// with function
// no extra space / variable

// To Code : 15 min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class Solution {
	private boolean isMatching(Character pop, Character c) {
		// can use switch here also
		if (pop == '(' && c != ')')
			return false;
		else if (pop == '{' && c != '}')
			return false;
		else if (pop == '[' && c != ']')
			return false;

		return true;
	}

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		for (Character c : s.toCharArray()) {
			if (c == '[' || c == '{' || c == '(')
				stack.push(c);
			else if (stack.isEmpty() || !isMatching(stack.pop(), c))
				return false;
		}

		return stack.empty(); // in case only push happens
	}
}
