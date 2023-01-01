class Solution {
	boolean isPalindrome(String s) {
		s = s.toLowerCase().replaceAll("\\W+", "");
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}