// https://leetcode.com/problems/reverse-linked-list/solutions/2682085/java-0ms-100-easy-understanding/

// no extra process for first / null element
// little advance to understand at first
// considering first as null, which is true, if we have not started traversing
// like mysirg.com, fibonacci series problem ... back tracking what will be value of a, b .... logic

class Solution {
	public ListNode reverseList(ListNode head) {
		ListNode first = null; // will point to first element
		ListNode ele = head; // traverse / current ... like i
		ListNode temp; // temp / will store next element index

		while (ele != null) {
			temp = ele.next;

			ele.next = first;
			first = ele;

			ele = temp;
		}

		return first;
	}
}