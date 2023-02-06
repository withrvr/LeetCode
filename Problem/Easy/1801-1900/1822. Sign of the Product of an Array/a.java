// ERROR if used this logic

// === PROBLEM ===
// Integer.MAX_VALUE
//== 2147483647, once you increment past that, you
// "wrap around" to Integer.MIN_VALUE
// THATS WHY IT WILL ALWAYS RETURN 0

// To Code : 3 min
// Execution : ERROR ms

// Time complexity: O(n)
// Space complexity: O(1)

class Solution {

	// int signFunc(int x) {
	// return x > 0 ? 1 : x < 0 ? -1 : 0;
	// }

	public int arraySign(int[] nums) {
		int mul = 1;

		for (int num : nums) {
			mul *= num;
			System.out.println(num + ":- " + mul);
		}

		int x = mul == 0 ? 0 : mul > 0 ? 1 : -1;
		System.out.println(x);

		return x;
	}
}
