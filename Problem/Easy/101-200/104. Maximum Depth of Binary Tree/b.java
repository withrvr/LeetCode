// counting when coming back from leaf to root again

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

// TC - O(num of nodes) as we are traversing all the nodes of the tree
// SC - O(height of the tree) for the recursive stack

class Solution {
	public int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return 1 + Math.max(left, right);
	}
}
