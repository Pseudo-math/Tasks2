using System;
using System.Collections.Generic;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public static int LengthOfList<T>(LinkedList<T> list) {
			if (list.Count == 0) return 0;
			var newList = new LinkedList<T>(list); // Не изменяем исходный список
			newList.RemoveFirst();
			return LengthOfList(newList) + 1;
		}
	}
}
