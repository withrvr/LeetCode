// using recursion

// advance / hard to understand ... also not recommend tho
// i didn't understand fully
// and cant implement by my self

// but

// Logic : First reach till the last node.
// : While returning at each step of returning change the next pointers, to make
// it reverse
// NOTE : Here with the help of recursion we are traversing backward in singly LinkList, with is not possible iteratively

class First {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode rtn = reverseList(head.next);
		ListNode after = head.next;

		after.next = head;
		head.next = null;

		return rtn;
	}
}

class Second {
	public ListNode reverseList(ListNode head) {
		if (head == null || head.next == null)
			return head;

		ListNode newHead = reverseList(head.next);

		head.next.next = head;
		head.next = null;

		return newHead;
	}
}
