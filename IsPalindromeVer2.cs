using System;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public static bool IsPalindrome(string maybePalindrome) {
			if (string.IsNullOrEmpty(maybePalindrome)) return true;
			return IsPalindromeHelp(maybePalindrome, 0);
		}
    		private bool IsPalindromeHelp(string maybePalindrome, int step) {
      			if (maybePalindrome.Length - step <= 1) return true;
      			if (maybePalindrome[step] != maybePalindrome[maybePalindrome.Length - 1 - step]) return false;
      			return IsPalindromeHelp(maybePalindrome, step + 1);
    		}
	}
}
