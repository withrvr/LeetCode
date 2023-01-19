// combo of a, b
// not recommended tho
// NOTE:- use head only as mid pointer

class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode current = head;

		int i = 0;

		while (current != null) {
			if (++i % 2 == 0)
				head = head.next;

			current = current.next;
		}
		return head;
	}
}
