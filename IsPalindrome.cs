using System;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public static bool IsPalindrome(string maybePalindrome, int step = 0) {
			if (string.IsNullOrEmpty(maybePalindrome) || maybePalindrome.Length - step <= 1) return true;
			if (maybePalindrome[step] != maybePalindrome[maybePalindrome.Length - 1 - step]) return false;
		    return IsPalindrome(maybePalindrome, step + 1);
		}
	}
}
