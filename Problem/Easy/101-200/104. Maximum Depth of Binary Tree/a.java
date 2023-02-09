// count as parameter
// and list will store it
// when null came

// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(n) + O(n)
// Space complexity: O(n)

import java.util.ArrayList;

class Solution {
	ArrayList<Integer> list = new ArrayList<>();

	public void helper(TreeNode root, int count) {
		if (root == null) {
			list.add(count);
			return;
		}

		helper(root.left, count + 1);
		helper(root.right, count + 1);
	}

	public int maxDepth(TreeNode root) {

		helper(root, 0);

		int max = 0;
		for (Integer val : list)
			if (val > max)
				max = val;

		return max;
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
