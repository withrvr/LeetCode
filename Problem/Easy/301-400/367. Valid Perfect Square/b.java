// check if last char is zero
// but don't use it
// just a logic

class Solution {
	public boolean isPerfectSquare(int num) {
		String val = String.valueOf(Math.sqrt(num));
		return val.charAt(val.length() - 1) == '0';
	}
}
