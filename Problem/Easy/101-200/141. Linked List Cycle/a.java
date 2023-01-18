// slow, fast method
// aka Floyd's_tortoise_and_hare:- https://en.wikipedia.org/wiki/Cycle_detection#Floyd's_tortoise_and_hare
// using try / catch for null to find
// because it will throw error for "null.next"

// To Code : 5 min
// Execution : 0 ms

// Time complexity: O(n)
// Space complexity: O(1)

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

class Solution {
	public boolean hasCycle(ListNode head) {
		try {
			// should use only head to init both
			// but try catch is there and will also increase performance
			// as we just need to find out if there is null or not / cycle
			// so if it came here also ... will go to catch .. and return false

			ListNode slow = head.next;
			ListNode fast = head.next.next;

			System.out.println(slow.val + ":" + fast.val);

			do {
				slow = slow.next;
				fast = fast.next.next;

				System.out.println(slow.val + ":" + fast.val);
			} while (slow != fast);
			// found intersection of slow, fast
			// not cycle intersection
			// but it proves that cycle is forming tho
		} catch (Exception e) {
			// will come here if any null pointer came
			// because null.next ... don't work
			// null will come from fast pointer only ... as fast is fast :)
			return false;
		}

		return true;
	}
}