// iterate
// using stack

// To Code : 15 min
// Execution : 3 ms

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.List;
import java.util.Stack;
import java.util.ArrayList;

class Solution {
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Stack<Node> stack = new Stack<>();
		stack.add(root);

		while (!stack.empty()) {
			root = stack.pop();

			list.add(root.val);

			for (int i = root.children.size() - 1; i >= 0; i--)
				stack.add(root.children.get(i));
		}

		return list;
	}
}
