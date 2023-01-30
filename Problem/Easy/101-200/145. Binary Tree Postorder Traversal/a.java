// recursion
// class ... variable & constructor

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.List;
import java.util.ArrayList;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}

class Solution {
	List<Integer> res = new ArrayList<Integer>();

	// Solution() {
	// res = new ArrayList<Integer>();
	// }

	public void helper(TreeNode node) {
		if (node == null)
			return;

		helper(node.left);
		helper(node.right);
		res.add(node.val);
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		helper(root);
		return res;
	}
}
