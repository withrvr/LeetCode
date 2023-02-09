class Solution {
	public int getDecimalValue(ListNode head) {
		int num = 0;

		for (; head != null; head = head.next)
			num = num * 2 + head.val;

		return num;
	}
}
