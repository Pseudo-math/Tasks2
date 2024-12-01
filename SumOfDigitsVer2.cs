using System;

namespace AlgorithmsDataStructures {
  	
	public class SumOfDigits {

		public int Sum(int n, int acc = 0) {
			if (n < 0) throw new ArgumentException("I don't know that do with negative");
			if (n == 0) return acc;
			return Sum(n / 10, n % 10 + acc);
		}
	}
}
