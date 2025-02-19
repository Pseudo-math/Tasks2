package Java;

import java.util.LinkedList;

public class RecursionSixth {
    public static void printEvenIndexes(LinkedList<Integer> list) {
        printEvenIndexes(list, 0);
    }

    public static void printEvenIndexes(LinkedList<Integer> list, int index) {
        if (index >= list.size()) return;
        System.out.println(list.get(index));
        printEvenIndexes(list, index + 2);
    }
}
