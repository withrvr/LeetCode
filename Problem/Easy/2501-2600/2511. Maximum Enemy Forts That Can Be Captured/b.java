class Solution {
	public int captureForts(int[] forts) {
		int max = 0, start = 0;

		for (int i = 0; i < forts.length; i++) {
			if (forts[i] != 0) { // if non 0
				if (forts[start] == -forts[i]) // (1 & -1) or (-1 & 1)
					max = Math.max(max, i - start - 1); // max
				start = i; // new start position ... can be 1 / -1
			}
		}

		return max;
	}
}