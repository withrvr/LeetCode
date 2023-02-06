// another logic
// 1 ms

class Solution {
	int signFunc(int x) {
		return x > 0 ? 1 : x < 0 ? -1 : 0;
	}

	public int arraySign(int[] nums) {
		int sum = 1;

		for (int num : nums)
			sum *= signFunc(num);

		return sum;
	}
}
