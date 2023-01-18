class Solution {
	public boolean hasCycle(ListNode head) {
		try {
			ListNode slow = head.next;
			ListNode fast = head.next.next;

			do {
				slow = slow.next;
				fast = fast.next.next;

			} while (slow != fast);
		} catch (Exception e) {
			return false;
		}

		return true;
	}
}