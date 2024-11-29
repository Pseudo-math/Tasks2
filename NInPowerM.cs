using System;

namespace AlgorithmsDataStructures {
  	
	public class Recursion {

		public static double NInPowerM(double n, int m) {
			if (n < 0) throw new ArgumentException("First argument must be a nonnegative number.");
			if (n == 0 && m <= 0) throw new ArgumentException("Zero cannot raise to a nonpositive power.");
			if (n == 0) return 0;
			if (n == 1 || m == 0) return 1;
			if (m == 1) return n;
			if (m > 0) return RecursionPower(n, m);
			else return RecursionPower(1 / n, -m); 
		}
		
        	private static double RecursionPower(double n, int m) {
			if (m == 0) return 1;
			if (m % 2 == 0) return RecursionPower(n * n, m / 2);
			return n * RecursionPower(n, m - 1);
		}
		
	}
}
