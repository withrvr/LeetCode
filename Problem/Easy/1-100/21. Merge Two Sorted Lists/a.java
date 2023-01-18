// loop

// new res pointer with dummy data

// To Code : 20 min
// Execution : 0 ms

// Time complexity: O(n + m)
// Space complexity: O(1)

// - in code this line means
// ```
// point = point.next = list1;
// ```

// - nothing but this
// ```java
// point.next = list1;
// point = list1;
// ```
// - short cut

class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode res = new ListNode();
		ListNode point = res;

		while (true) {
			if (list1 == null) {
				point.next = list2;
				break;
			} else if (list2 == null) {
				point.next = list1;
				break;
			} else if (list1.val < list2.val) {
				point = point.next = list1;
				list1 = list1.next;
			} else {
				point = point.next = list2;
				list2 = list2.next;
			}
		}

		return res.next;
	}
}
