// min, max
// recursion

// To Code : 15 min
// Execution : 5 ms

// Time complexity: O(log(n))
// Space complexity: O(log(n)) ... recursion heap

class Solution {
	int min, max;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		min = Math.min(p.val, q.val);
		max = Math.max(p.val, q.val);

		return helper(root);
	}

	public TreeNode helper(TreeNode root) {
		if (root.val > max)
			return helper(root.left);

		if (root.val < min)
			return helper(root.right);

		return root;
	}
}