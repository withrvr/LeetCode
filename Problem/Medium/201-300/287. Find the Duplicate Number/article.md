# 🐢/🐇: Slow / Fast Method
- Time: O(n) & Space: O(1) without modifying the array
- Floyd's Algorithm
- ✅: Full Explanation with DIAGRAM
- 🔥: 4ms only

# 🤔: ???

- Main Class there are
- all example possible to understand the method more nicely
- aka, corner cases
- which are because of which you are unable to understand
- or is confusing you
- draw it and you will understand
- like below

# 📒: Note

- create Main.java file locally and try to run by you self
- also
- create your own diagram for other example
- and try running locally
-
- i have shown for
- { 2, 6, 4, 1, 7, 1, 5, 3, 10, 11, 8, 12, 9 }

# 🔢: Values

![](https://assets.leetcode.com/users/images/086348d3-69be-416a-8fff-24d1b47d4c81_1673250562.5988944.png)

![](https://assets.leetcode.com/users/images/21cd76aa-f16e-4451-a389-f5c9c2bedea9_1673251563.3783538.png)

# 🗨️: Its Diagram

- create 3 diff loops .... logically for this example
- but algorith will work for 1st loop only


![](https://assets.leetcode.com/users/images/a977cd64-6097-4cfc-b808-f5721ae42bab_1673252033.228035.png)

![](https://assets.leetcode.com/users/images/cd2b7936-56e2-4a89-a77b-36e1de87786c_1673252265.003069.png)

![image.png](https://assets.leetcode.com/users/images/f5752e75-0409-4696-838a-fd7718b7849a_1673252574.755807.png)


# 👨‍💻: Code With Explanation

```java

// slow, fast method

// To Code : ? min
// Execution : ? ms

// Time complexity: O(n)
// Space complexity: O(1)

public class Main {
	public static void main(String[] args) {
		Solution s = new Solution();
		int arr[];
		arr = new int[] { 2, 6, 4, 1, 3, 1, 5 };
		arr = new int[] { 2, 5, 9, 6, 9, 3, 8, 9, 7, 1 };

		arr = new int[] { 1, 3, 4, 2, 5, 2 };
        // special condition // intersection and duplicate is same
		arr = new int[] { 1, 3, 4, 2, 5, 6, 2 };
        // never visit 5 while finding intersection ... but will after

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
		int slow = 0, fast = 0;
		int new_slow = -1; // intersection / new slow
		int dup = -1; // duplicate

        // finding intersection
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];

			System.out.print(String.format("slow: %d, fast: %d\n", slow, fast));
		} while (slow != fast);

		slow = 0;
		new_slow = fast; // intersection and new new slow
		System.out.println("Intersection:- " + new_slow + "\n");

        // finding duplicate
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

// can do without using new_slow and dup
// using fast only as variable
// but using new variables here to understand the problem


```

# 🗜️: Compress version

- short version of above code
- without explanation
- also without new_slow and dup
    - which was for explanation

```java

class Solution {
	public int findDuplicate(int[] nums) {
		int slow = 0, fast = 0;

		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		slow = 0;
		while (fast != slow) {
			slow = nums[slow];
			fast = nums[fast];
		}

		return fast;
	}
}


```

# More Detail

- Approach 7: Floyd's Tortoise and Hare (Cycle Detection)
- https://leetcode.com/problems/find-the-duplicate-number/solutions/127594/find-the-duplicate-number/


.
