using System;

namespace AlgorithmsDataStructures {
  	
	public class SumOfDigits {

		public int Sum(int n) {
			if (n < 0) throw new ArgumentException("I don't know what to do with a negative number.");
			return RecursionSum(n);
		}

		private int RecursionSum(int n) {
			if (n == 0) return 0;
			return n % 10 + RecursionSum(n / 10);
		}
	}
}
