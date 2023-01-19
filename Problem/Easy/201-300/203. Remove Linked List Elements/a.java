// To Code : 10 min
// Execution : 1 ms

// Time complexity: O(n)
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
	public ListNode removeElements(ListNode head, int val) {

		// // can be handle ... but if you have to add can add it
		// if (head == null)
		// return null;

		ListNode point = new ListNode(-1, head);
		ListNode first = point;

		while (point.next != null) {
			if (point.next.val == val) {
				ListNode temp = point.next;
				point.next = temp.next; // or point.next.next // pointing to next node
				temp.next = null; // removing that node
			} else {
				// not making to do for all
				// because new node attacked after removing
				// we need to check that also
				point = point.next; // traverse
			}
		}

		return first.next;
	}
}
