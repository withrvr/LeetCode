// 1 ms
// using queue

import java.util.*;

class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> result = new ArrayList<>();

		if (root == null)
			return result;

		Queue<TreeNode> queue = new LinkedList<>();

		queue.add(root);

		while (!queue.isEmpty()) {
			List<Integer> level_subList = new ArrayList<>();
			int levelSize = queue.size();

			for (int i = 0; i < levelSize; i++) {
				root = queue.remove();

				level_subList.add(root.val);

				if (root.left != null)
					queue.add(root.left);

				if (root.right != null)
					queue.add(root.right);
			}

			result.add(level_subList);
		}

		return result;
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
