// just a solution don't use it

class Solution {
	public int hammingWeight(int n) {
		int c = 0;
		String s = Integer.toBinaryString(n);

		for (int i = 0; i < s.length(); i++)
			if (s.charAt(i) == '1')
				c++;

		return c;
	}
}
