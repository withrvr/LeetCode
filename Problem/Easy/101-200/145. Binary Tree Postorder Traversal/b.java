// recursion
// without ... class ... variable & constructor

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

import java.util.List;
import java.util.ArrayList;

class Solution {
	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		helper(root, res);
		return res;
	}

	public void helper(TreeNode root, List<Integer> res) {
		if (root != null) {
			helper(root.left, res);
			helper(root.right, res);
			res.add(root.val);
		}
	}
}
