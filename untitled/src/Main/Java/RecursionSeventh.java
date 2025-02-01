package Java;

import java.util.LinkedList;

public class RecursionSeventh {
    public static void printSecondMax(LinkedList<Integer> list) {
        printSecondMax(list, (int) Integer.MIN_VALUE, 0, 0);
    }

    public static void printSecondMax(LinkedList<Integer> list, int firstMax, int secondMax, int index) {
        if (index >= list.size()) {
            System.out.println(secondMax);
            return;
        }
        int current = list.get(index);
        if (current > firstMax) {
            secondMax = firstMax;
            firstMax = current;
        }
        printSecondMax(list, firstMax, secondMax, index + 1);
    }
}