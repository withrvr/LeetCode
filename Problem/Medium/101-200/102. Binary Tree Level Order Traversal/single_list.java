// iterate
// queue

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.List;
// import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class Solution {
	List<List<Integer>> res = new LinkedList<List<Integer>>();
	List<Integer> list = new LinkedList<>();

	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return res;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			root = queue.remove();

			list.add(root.val);

			if (root.left != null)
				queue.add(root.left);
			if (root.right != null)
				queue.add(root.right);
		}

		System.out.println("Using only One list");
		System.out.println(list.toString());

		return res;
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
