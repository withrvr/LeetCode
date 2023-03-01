// a.java short version

class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		try {
			do {
				slow = slow.next;
				fast = fast.next.next;
			} while (slow != fast);
		} catch (Exception e) {
			return null;
		}

		slow = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}
}
