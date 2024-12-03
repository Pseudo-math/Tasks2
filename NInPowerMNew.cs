using System;

namespace AlgorithmsDataStructures {
  	
	public class Recursion {

		public static double NInPowerM(int n, int m) {
		  return NInPowerMHelp(n, m, 1);
		}
		public static double NInPowerMHelp(int n, int m, int acc) {
			if (m == 0) return acc;
			m--;
		  return NInPowerMHelp(n, m, acc * n);
		}
	}  
}
