// using helper since cant use default parameter in java

// is left as parameter
// sum to calculate

// check if any left / right
// for if its leaf node or not

// To Code : 30 min
// Execution : 0 ms

// Time complexity: O(n) ... traverse
// Space complexity: O(n) ... for tree stack

class Solution {
	int sum = 0;

	public void helper(TreeNode root, boolean isLeft) {
		if (root == null)
			return;

		// if it is left leaf node
		// from 1 level up ... from null
		// ie. when reacted to null from both side
		if (isLeft && root.left == null && root.right == null) {
			sum += root.val;
			return;
		}

		helper(root.left, true);
		helper(root.right, false);
	}

	public int sumOfLeftLeaves(TreeNode root) {
		helper(root, false);
		return sum;
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