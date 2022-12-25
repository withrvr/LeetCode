// original ... first successful submission
// not fully optimized

// see b.java .... same logic .... but fully optimized

class Solution {
	public int captureForts(int[] forts) {
		int max = 0, start = -1;

		for (int i = 0; i < forts.length; i++) {
			// int val = forts[i];
			if (forts[i] != 0) {

				// because of below comment .... for some condition / situation .... i added
				// start =-1
				if (start == -1)
					start = i;

				// very first submission
				// i didn't check this ... iy will give result for 1to1 and -1to-1 also

				if ((forts[start] == -1 && forts[i] == 1) || (forts[start] == 1 && forts[i] == -1)) {
					int diff = i - start - 1;
					if (diff > max)
						max = diff;
				}
				start = i;
			}
		}

		return max;
	}
}