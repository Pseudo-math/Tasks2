using System;
using System.Collections.Generic;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public static int LengthOfList<T>(LinkedList<T> list) {
			var newList = new LinkedList<T>(list); // Не изменяем исходный список
			return LengthOfListHelp(newList, 0);
		}
   		private int LengthOfListHelp<T>(LinkedList<T> newList, int accLength) {
			if (newList.Count == 0) return accLength;
			newList.RemoveFirst();
			return  LengthOfListHelp(newList, accLength + 1);
		}
	}
}
