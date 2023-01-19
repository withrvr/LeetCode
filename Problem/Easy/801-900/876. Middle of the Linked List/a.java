// find size
// then middle

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(2n) --> O(n)
// Space complexity: O(1)

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode point = head;
		int size = 0;

		// finding size
		while (point != null) {
			size++;
			point = point.next;
		}

		int mid = size / 2;
		point = head;

		System.out.println(size + " : " + mid);

		// mid pointer
		while (mid-- > 0)
			point = point.next;

		return point;
	}
}
