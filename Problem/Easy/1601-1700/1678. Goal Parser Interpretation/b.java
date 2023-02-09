// ? ms

// O(n+n)

class Solution {
	public String interpret(String command) {
		String op = command.replace("()", "o");
		String sop = op.replace("(al)", "al");

		return sop;
	}
}