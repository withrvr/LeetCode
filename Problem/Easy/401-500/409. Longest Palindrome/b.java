// To Code : 2 hr
// Execution : 8 ms --> as per _b.java

// Time complexity: O(n)
// Space complexity: O(n)

import java.util.HashMap;

class xyz {
	public static void main(String[] args) {
		Solution s = new Solution();
		// System.out.println("\nAns:- " + s.longestPalindrome("abcccddxxxxxxpp") +
		// "\n");
		// expected: 983
		System.out.println("\nAns:- " + s.longestPalindrome(
				"civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth"));
	}
}

class Solution {
	public int longestPalindrome(String s) {
		HashMap<Character, Integer> hm = new HashMap<>();

		// make hashmap of s
		// how many time that ch counts
		for (int i = 0; i < s.length(); i++) {
			Character ch = s.charAt(i);
			int val = hm.getOrDefault(ch, 0);

			hm.put(ch, val + 1);
		}

		int count = 0;
		int even = 0;
		int odd = 0;
		boolean odd_came = false;

		for (Character key : hm.keySet()) {
			Integer val = hm.get(key);

			System.out.print(key + " : " + val + " : ");

			// if even
			if (val % 2 == 0) {
				even += val;
				count += val;
				System.out.println("even");
			} else {
				odd += val;
				odd_came = true;
				count += (val - 1);
				System.out.println("odd");
			}
		}

		System.out.println(String.format("even: %d, odd: %d, count: %d", even, odd, count));

		return odd_came ? count + 1 : count;
	}
}
