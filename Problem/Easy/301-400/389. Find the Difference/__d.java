// _d.java ... logic

// + to t
// - to s

// will get the res then

// no idea ... but if int .. then .. converted to char ... at end works fast

class Solution {
	public char findTheDifference(String s, String t) {
		char res = t.charAt(s.length());

		for (int i = 0; i < s.length(); i++)
			res += t.charAt(i) - s.charAt(i);

		// res += t.charAt(i);
		// res -= s.charAt(i);

		// if res != 0 ... at start then
		// res += t.charAt(i);

		return res;
	}
}