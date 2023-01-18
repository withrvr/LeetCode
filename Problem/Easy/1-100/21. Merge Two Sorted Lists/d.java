// same as c.java
// but here
// letting list_1 be always smaller

class Solution {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		final ListNode res = new ListNode();
		ListNode point = res;

		while (list1 != null && list2 != null) {
			if (list1.val > list2.val) {
				ListNode temp = list1;
				list1 = list2;
				list2 = temp;
			}

			point = point.next = list1;
			list1 = list1.next;
		}

		point.next = list1 != null ? list1 : list2;
		return res.next;
	}
}
