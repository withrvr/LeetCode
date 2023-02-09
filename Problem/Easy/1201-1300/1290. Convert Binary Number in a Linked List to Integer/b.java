class Solution {
	public int getDecimalValue(ListNode head) {
		int num = 0;

		while (head != null) {
			num = num * 2 + head.val; // using int operator
			// num = (num << 1) | head.val; // using bit operation
			head = head.next;
		}

		return num;
	}
}
