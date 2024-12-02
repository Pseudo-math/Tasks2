using System;

namespace AlgorithmsDataStructures {
  	
	public class SumOfDigits {

		public int Sum(int n) {
			if (n < 0) throw new ArgumentException("I don't know that do with negative");
      return SumHelp(n, 0);
		}
    private int SumHelp(int n, int acc) {
      if (n == 0) return acc;
      return Sum(n / 10, n % 10 + acc);
	}
}
