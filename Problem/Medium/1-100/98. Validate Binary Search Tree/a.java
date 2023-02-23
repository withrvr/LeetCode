// recursion

// To Code : 30 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(n) ... for recursion

// Integer.MIN_VALUE: was not working ... for big values
// Float.MIN_VALUE: don't work properly ... no idea

// thats y using
// null
// also NOTE: Integer not int

// or see _a.java using long

class Solution {
	public boolean isValidBST(TreeNode root) {
		return validate(root, null, null);
	}

	private boolean validate(TreeNode root, Integer low, Integer high) {
		if (root == null)
			return true;

		if ((low != null && root.val <= low) || (high != null && root.val >= high))
			return false;

		return validate(root.left, low, root.val) && validate(root.right, root.val, high);
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
