// 0 ms
// recursion

import java.util.*;

class Solution {
	List<List<Integer>> result = new ArrayList<List<Integer>>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		helper(root, 0);
		return result;
	}

	// bfs
	public void helper(TreeNode root, int height) {
		if (root == null)
			return;

		if (height == result.size()) // == better .. but `>=` can be good practice
			result.add(new ArrayList<>());

		result.get(height).add(root.val);

		helper(root.left, height + 1);
		helper(root.right, height + 1);
	}
}
