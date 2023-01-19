// without using first pointer, or new first dummy node at start
// ListNode point = new ListNode(-1, head);
// ListNode first = point;

class Solution {
	public ListNode removeElements(ListNode head, int val) {
		// this condition is IMP here in this solution
		if (head == null)
			return null;

		ListNode point = head;

		while (point.next != null) {
			if (point.next.val == val)
				point.next = point.next.next;
			else
				point = point.next;
		}

		// because we are not checking very first node ... we have to check it here
		return head.val == val ? head.next : head;
	}
}
