// don't use it
// return list make no sense
// since it will never be use

// use using helper

class Solution {
	public List<Integer> list = new ArrayList<>();

	public List<Integer> preorder(Node root) {
		if (root == null)
			return list;

		list.add(root.val);
		for (Node node : root.children)
			preorder(node);

		return list;
	}
}
