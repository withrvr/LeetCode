// short version .. b.java

class Solution {
	public int maxDepth(TreeNode root) {
		return root == null ? 0 : Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
	}
}
