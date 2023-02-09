// using string buffer
// instead of string

// 0ms

class Solution {
	public int getDecimalValue(ListNode head) {
		StringBuffer num = new StringBuffer();

		while (head != null) {
			num.append(head.val);
			head = head.next;
		}

		return Integer.parseInt(num.toString(), 2);
	}
}
