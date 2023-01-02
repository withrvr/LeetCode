// Stack

// first solution by me

// To Code : 15 min
// Execution : 2 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();

		String opening = "({["; // , ending = ")}]";
		Character pop;

		for (Character c : s.toCharArray()) {
			if (opening.contains(c.toString())) // c == '[' || c == '{' || c == '('
				stack.push(c);
			else { // ending Parentheses comes
				if (stack.isEmpty()) // if direct pop operation came ... for ending parentheses
					return false;

				pop = stack.pop();

				if (pop == '(' && c != ')' ||
						pop == '{' && c != '}' ||
						pop == '[' && c != ']')
					return false;
			}
		}

		return stack.empty(); // in case only push happens
	}
}
