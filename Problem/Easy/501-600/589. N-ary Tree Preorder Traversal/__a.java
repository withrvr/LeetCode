// a.java short version

import java.util.List;
import java.util.ArrayList;

class Solution {
	List<Integer> res = new ArrayList<>();

	public List<Integer> preorder(Node root) {
		dfs(root);
		return res;
	}

	public void dfs(Node root) {
		if (root == null)
			return;

		res.add(root.val);

		for (Node child : root.children)
			dfs(child);
	}
}
