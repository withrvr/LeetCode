// count as parameter
// and max check on null

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	int max = 0;

	public void helper(TreeNode root, int count) {
		if (root == null) {
			if (count > max)
				max = count;
			return;
		}

		helper(root.left, count + 1);
		helper(root.right, count + 1);
	}

	public int maxDepth(TreeNode root) {
		helper(root, 0);
		return max;
	}
}
