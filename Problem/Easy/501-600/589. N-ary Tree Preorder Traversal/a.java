// tree
// dfs: depth first search
// recursion

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.List;
import java.util.ArrayList;

class Solution {
	List<Integer> res = new ArrayList<>();

	public void dfs(Node root) {
		if (root == null)
			return;

		res.add(root.val);

		for (Node child : root.children)
			dfs(child);
	}

	public List<Integer> preorder(Node root) {
		dfs(root);
		return res;
	}
};

class Node {
	public int val;
	public List<Node> children;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, List<Node> _children) {
		val = _val;
		children = _children;
	}
};
