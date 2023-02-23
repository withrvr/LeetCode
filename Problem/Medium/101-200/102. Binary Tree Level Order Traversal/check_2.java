import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
