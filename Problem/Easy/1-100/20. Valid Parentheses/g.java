// a.java logic
// using Hash Map

// To Code : 5 min
// Execution : 2 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.HashMap;
import java.util.Stack;

class Solution {
	public boolean isValid(String s) {
		HashMap<Character, Character> map = new HashMap<>();

		// can use Map.of()
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');

		Stack<Character> stack = new Stack<>();

		for (char ch : s.toCharArray()) {
			if (map.containsKey(ch))
				stack.push(ch);
			else if (stack.isEmpty() || map.get(stack.pop()) != ch)
				return false;
		}

		return stack.isEmpty();
	}
}