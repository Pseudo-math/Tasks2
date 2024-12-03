using System;
using System.Collections.Generic;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public void evenValues<T>(List<T> list) {
			evenValuesHelp(List, 0);
		}
   		private void evenValuesHelp<T>(LinkedList<T> list, int index) {
			if (index == list.Count) return;
	    		if (list[index] % 2) Console.WriteLine(list[index]);
			evenValuesHelp(list, index + 1);
		}
	}
}
