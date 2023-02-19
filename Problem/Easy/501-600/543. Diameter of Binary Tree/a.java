class Solution {
	int max_diameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		maxDepth(root);
		return max_diameter;
	}

	private int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		max_diameter = Math.max(max_diameter, left + right);

		return 1 + Math.max(left, right);
	}
}

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
