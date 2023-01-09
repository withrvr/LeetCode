// see h.java for ... compress version ... without explanation

// slow, fast method
// tortoise, hare method

// Approach 7: Floyd's Tortoise and Hare (Cycle Detection)
// https://leetcode.com/problems/find-the-duplicate-number/solutions/127594/find-the-duplicate-number/

// To Code : not understand at first ... to took time
// Execution : 4 ms ... without print ... and main ... to be consider ... which are to understand

// Time complexity: O(n) .... O(n+n)
// Space complexity: O(1)

public class g {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		arr = new int[] { 2, 6, 4, 1, 3, 1, 5 };
		arr = new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };

		arr = new int[] { 1, 3, 4, 2, 5, 2 }; // special condition // intersection and duplicate is same
		arr = new int[] { 1, 3, 4, 2, 5, 6, 2 }; // never visit 5 while finding intersection ... but will after

		arr = new int[] { 3, 1, 3, 4, 2, 5, 6 };
		// not consider as element only
		// 1, 5, 6 .... is never never visited
		// as index and its value is same
		// aka, self single element loop 1 --> 1 --> 1 --> 1

		arr = new int[] { 1, 3, 4, 2, 2 };
		arr = new int[] { 2, 6, 4, 1, 7, 1, 5, 3, 10, 11, 8, 12, 9 };
		// creating its own loops
		// --> 10 --> 8 --> 10
		// --> 9 ---> 11 --> 12 --> 9
		// which is not a part of main which will form loop

		System.out.println("Ans:- " + s.findDuplicate(arr));
	}
}

class Solution {
	public int findDuplicate(int[] nums) {
		int slow = 0; // tortoise
		int fast = 0; // hare
		int new_slow = -1; // intersection / new slow
		int dup = -1; // duplicate

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];

			System.out.print(String.format("slow: %d, fast: %d\n", slow, fast));
		} while (slow != fast);

		slow = 0;
		new_slow = fast; // intersection and new new slow
		System.out.println("Intersection:- " + new_slow + "\n");

		while (new_slow != slow) {
			slow = nums[slow];
			new_slow = nums[new_slow];

			System.out.println(String.format("slow: %d, new_slow: %d", slow, new_slow));
		}

		dup = new_slow;

		System.out.println("Duplicate:- " + dup);
		return dup;
	}
}