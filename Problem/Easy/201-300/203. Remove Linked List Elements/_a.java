// same as a.java

class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode point = new ListNode(-1, head);
		ListNode first = point;

		while (point.next != null) {
			if (point.next.val == val)
				point.next = point.next.next; // without temp, after removing not pointing to null
			else
				point = point.next;
		}

		return first.next;
	}
}
