// head as slow

class Solution {
	public boolean hasCycle(ListNode head) {
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			head = head.next;
			fast = fast.next.next;

			if (head == fast)
				return true;
		}

		return false;
	}
}
