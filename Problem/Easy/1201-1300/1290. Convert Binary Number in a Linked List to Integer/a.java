// int don't work because
// greater than int value

// To Code : 5 min
// Execution : 8 ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {
	public int getDecimalValue(ListNode head) {
		String num = "";

		while (head != null) {
			num += head.val;
			head = head.next;
		}

		return Integer.parseInt(num, 2);
	}
}

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
