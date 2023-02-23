import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Example:-`[3,9,20,12,2,null,2,15,null,null,7,3,4,5,6,7,8]`

class Solution {
	public List<Integer> preorder(Node root) {
		List<Integer> list = new ArrayList<>();
		if (root == null)
			return list;

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			root = queue.remove();

			list.add(root.val);

			for (Node node : root.children)
				queue.add(node);
		}

		return list;
	}
}
