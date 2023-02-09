// 1 ms

// O(n+n)

class Solution {
	public String interpret(String command) {
		return command.replace("()", "o").replace("(al)", "al");
	}
}