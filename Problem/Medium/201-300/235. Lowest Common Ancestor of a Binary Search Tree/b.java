// iterate
// min, max

// To Code : 15 min
// Execution : 5 ms

// Time complexity: O(log(n))
// Space complexity: O(1)

class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		int small = Math.min(p.val, q.val);
		int large = Math.max(p.val, q.val);

		while (true) { // root != null
			if (root.val > large)
				root = root.left;
			else if (root.val < small)
				root = root.right;
			else
				return root;
		}

		// return null;
	}
}
