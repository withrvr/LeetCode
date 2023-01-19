// slow, fast ... on intersection point

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n/2) --> O(n)
// Space complexity: O(1)

class Solution {
	public ListNode middleNode(ListNode head) {
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			head = head.next;
			fast = fast.next.next;

			System.out.print(head.val + " : ");
			System.out.println(fast != null ? fast.val : "null");
		}

		return head;
	}
}
