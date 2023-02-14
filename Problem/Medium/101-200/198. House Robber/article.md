[https://leetcode.com/problems/house-robber/solutions/3186347/best-most-different-logic/](https://leetcode.com/problems/house-robber/solutions/3186347/best-most-different-logic/)

# This particular problem and most of others can be approached using the following sequence:

1. Find recursive relation
2. Recursive (top-down)
3. Recursive + memo (top-down)
4. Iterative + memo (bottom-up)
5. Iterative + N variables (bottom-up)

---

# Common / Best logic possible

- done by all
- using `5. Iterative + N variables (bottom-up)`

<iframe src="https://leetcode.com/playground/iF2yHDTt/shared" frameBorder="0" width="100%"></iframe>


# My Differnt Logic .... NO. 1

- approch `5. Iterative + N variables (bottom-up)`
- but diff logic
- you can try other by your self

```
class Solution {
	int rob(int nums[]) {
		int a = 0;
		int b = 0;

		for (int i = 0; i < nums.length; i++)
			if (i % 2 == 0)
				a = Math.max(a + nums[i], b);
			else
				b = Math.max(a, b + nums[i]);

		return Math.max(a, b);
	}
}
```


# My Differnt Logic .... NO. 2

- which i came up with at first
- its also diffrent from above logic
- but its approch `4. Iterative + memo (bottom-up)`
- also using same array ... to modify 

```java
// ex: 2,1,1,2,x,x,x,x

// nums[3] = nums[3] + Math.max(nums[0], nums[1]);

class Solution {
	public int rob(int[] nums) {
		if (nums.length == 1)
			return nums[0];

		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		// if (nums.length == 3)
		// return Math.max(nums[1], nums[2] + nums[0]);

		nums[2] += nums[0];

		for (int i = 3; i < nums.length; i++)
			nums[i] += Math.max(nums[i - 3], nums[i - 2]);

		return Math.max(nums[nums.length - 2], nums[nums.length - 1]);
	}
}

```