class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null)
			return head;

		ListNode ele = head;
		ListNode temp = ele.next;
		ele.next = null;
		ele = temp;

		while (ele != null) {
			temp = ele.next;

			ele.next = head;
			head = ele;

			ele = temp;
		}

		return head;
	}
}
