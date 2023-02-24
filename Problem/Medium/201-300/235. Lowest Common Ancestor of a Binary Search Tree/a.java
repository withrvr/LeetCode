// both values
// - low
// - high
// - other .... same / different side

// To Code : 10 min
// Execution : 5 ms

// Time complexity: O(log(n)) .... ie height of the tree .... because choosing which side to go
// Space complexity: O(log(n)) ..... recursion

class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		// both values are low
		if (root.val > p.val && root.val > q.val)
			return lowestCommonAncestor(root.left, p, q);

		// both values are high
		if (root.val < p.val && root.val < q.val)
			return lowestCommonAncestor(root.right, p, q);

		// same val as root
		// values in left and right
		return root;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
