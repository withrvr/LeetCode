// proof: 0 ms, 100% beats
// https://leetcode.com/problems/linked-list-cycle-ii/submissions/881143202/
// solution

// slow, fast method

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n) ... from intersection of slow fast + then cycle intersection
// Space complexity: O(1)

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

// using try catch is best
// because if there is no cycle it will encounter null
// and throw error (because of "null".next) ... cant be done
// so instead of using if(fast != null && fast.next != null)
// which make code big and add so much lines/execution
// use try catch to find if null came / cycle is there or not

class Solution {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		try {
			// finding intersection point, of slow, fast
			do {
				slow = slow.next;
				fast = fast.next.next;
			} while (slow != fast);
		} catch (Exception e) {
			// if null came it will come here
			// because of "null".next ... from fast.next or fast.next.next
			return null;
		}

		// finding cycle starting point
		slow = head; // or fast = head ... any ... both are same
		while (slow != fast) {
			slow = slow.next; // from head point
			fast = fast.next; // from intersection point
		}

		return slow; // or return fast any ... both are same
	}
}
