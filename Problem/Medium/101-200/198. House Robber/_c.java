// c.java
// more better version

class Solution {
	public int rob(int[] nums) {
		int first = 0;
		int second = 0;
		int temp;

		for (int val : nums) {
			temp = first;
			first = second;
			second = Math.max(second, val + temp);
		}

		return second;
	}
}
