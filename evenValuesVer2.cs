using System;
using System.Collections.Generic;

namespace AlgorithmsDataStructures {

	public class Recursion {

		public void LengthOfList<T>(LinkedList<T> list) {
			if (list.Count == 0) return;
			int lastElement = list.Count - 1;
			if (list[lastElement] % 2) Console.WriteLine(list[lastElement]);
			var newList = new LinkedList<T>(list); // Не изменяем исходный список
			newList.RemoveAt(lastElement);
			evenValues(newList);
		}
	}
}
