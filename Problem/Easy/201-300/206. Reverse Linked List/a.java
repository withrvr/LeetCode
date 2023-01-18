// making every next node as head
// while traversing to the end

// which will make last element as first element
// and automatically reverse

// To Code : 20 min
// Execution : ? ms

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
	public ListNode reverseList(ListNode head) {
		// if empty
		if (head == null)
			return head;

		ListNode ele = head; // to traverse

		// for first element
		ListNode temp = ele.next;
		ele.next = null;
		ele = temp;

		while (ele != null) {
			// next element point
			temp = ele.next;

			// make as first element
			ele.next = head; // make element point to current first
			head = ele; // now make it as first element

			// traverse
			ele = temp;
		}

		return head;
	}
}
