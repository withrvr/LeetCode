// NOTE: hi = letters.length .... IMP
// here

class Solution {
	public char nextGreatestLetter(char[] letters, char target) {
		int lo = 0, hi = letters.length;

		while (lo < hi) {
			int mi = lo + (hi - lo) / 2;

			// System.out.println(lo + " : " + mi + " : " + hi);

			if (letters[mi] <= target)
				lo = mi + 1;
			else
				hi = mi;
		}

		// if(lo == letters.length)
		// return letters[0];
		// else
		// return letters[lo];

		return letters[lo % letters.length];
	}
}
