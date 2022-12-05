class Solution {
	public boolean isCircularSentence(String sentence) {
		// boolean res = true; // no need can return directly in this case
		int size = sentence.length();

		if (sentence.charAt(0) != sentence.charAt(size - 1))
			return false;

		for (int i = 1; i < size - 1; i++)
			if (sentence.charAt(i) == ' ' && sentence.charAt(i - 1) != sentence.charAt(i + 1))
				return false;

		return true;
	}
}