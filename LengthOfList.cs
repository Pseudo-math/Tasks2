using System;
using System.Collections.Generic;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public static int LengthOfList<T>(LinkedList<T> list, int accLength = 0) {
			if (list.Count == 0) return accLength;
			var newList = new LinkedList<T>(list); // Не изменяем исходный список
			newList.RemoveFirst();

			return LengthOfList(newList, accLength + 1);
		}
	}
}
