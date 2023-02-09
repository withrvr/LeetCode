/**
 * DFS Recursive
 *
 * Time Complexity: O(N). All nodes will be visited.
 *
 * Space Complexity: O(H). Stack space.
 * In case of balanced tree (best case) it will be O(log N) and in case of
 * Skewed Tree (worst case) it will be O(N)
 *
 * N = Number of nodes. H = Height of the tree.
 */

class Solution {
	public int sumOfLeftLeaves(TreeNode root) {
		if (root == null) {
			return 0;
		}

		// Checking if left Node is a leaf node
		if (root.left != null && root.left.left == null && root.left.right == null) {
			return root.left.val + sumOfLeftLeaves(root.right);
		}

		// Exploring the tree further.
		return sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
	}
}