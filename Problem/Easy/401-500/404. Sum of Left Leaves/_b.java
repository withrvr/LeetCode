// my version
// without using isLeft variable

class Solution {
	int sum = 0;

	public void helper(TreeNode root) {
		if (root == null)
			return;

		// from 2 level up .... from null
		// ie. checking when reacted above it
		// if left and leaf node
		if (root.left != null && root.left.left == null && root.left.right == null) {
			sum += root.left.val;
			sumOfLeftLeaves(root.right); // *******
			return;
		}

		sumOfLeftLeaves(root.left);
		sumOfLeftLeaves(root.right);
	}

	public int sumOfLeftLeaves(TreeNode root) {
		helper(root);
		return sum;
	}
}