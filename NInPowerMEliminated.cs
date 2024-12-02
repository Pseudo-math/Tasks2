using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace AlgorithmsDataStructures {
  	
	public class Recursion {

		public static double NInPowerM(double n, int m, double acc = 1) {
			if (n < 0) throw new ArgumentException("First argument must be a nonnegative number.");
			if (n == 0 && m <= 0) throw new ArgumentException("Zero cannot raise to a nonpositve power.");
			if (n == 0) return 0;
			if (n == 1) return 1;
			if (m == 0) return acc;
			if (m < 0) {
				n = 1 / n;
				m = -m;
			}
			if (m % 2 == 0) {
				n = n * n;
				m = m / 2;
			}
			else {
				m--;
				acc = acc * n;
			}
		    	return NInPowerM(n, m, acc);
		}
	}  
}
