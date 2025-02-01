package Main;

import java.util.LinkedList;

public class Recursion {
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
    public static void printEvenIndexes(LinkedList<Integer> list) {
        printEvenIndexes(list, 0);
    }
    public static void printEvenIndexes(LinkedList<Integer> list, int index) {
        if (index >= list.size()) return;
        if (index % 2 == 0)
            System.out.println(list.get(index));
        printEvenIndexes(list, index + 1);
    }
    public static void printSecondMax(LinkedList<Integer> list) {
        printSecondMax(list, (int)Integer.MIN_VALUE, 0, 0);
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