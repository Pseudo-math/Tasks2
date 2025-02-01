package Java;

import java.util.LinkedList;

public class RecursionFifth {
    public static void printEvenValues(LinkedList<Integer> list) {
        printEvenValues(list, 0);
    }

    public static void printEvenValues(LinkedList<Integer> list, int index) {
        if (index >= list.size()) return;
        int current = list.get(index);
        if (current % 2 == 0)
            System.out.println(current);
        printEvenValues(list, index + 1);
    }
}