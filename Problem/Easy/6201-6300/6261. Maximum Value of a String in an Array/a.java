class Solution {
	public boolean isInt(String str) {
		try {
			@SuppressWarnings("unused")
			int x = Integer.parseInt(str);
			return true; // String is an Integer
		} catch (NumberFormatException e) {
			return false; // String is not an Integer
		}
	}

	public int maximumValue(String[] strs) {
		int max = Integer.MIN_VALUE;
		int len;

		for (String w : strs) {
			if (isInt(w)) // if int
				len = Integer.parseInt(w);
			else // if string
				len = w.length();

			// check if len is greater
			if (len > max)
				max = len;
		}
		return max;
	}
}