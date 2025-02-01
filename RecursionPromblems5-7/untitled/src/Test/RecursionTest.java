package Test;

import static org.junit.jupiter.api.Assertions.*;

import Main.Recursion;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;

class RecursionTest {

    @Test
    void printEvenValues() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Recursion.printEvenValues(list);

        assertEquals("2\n4\n", outContent.toString());
    }

    @Test
    void printEvenIndexes() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Recursion.printEvenIndexes(list);

        assertEquals("10\n20\n30\n", outContent.toString());
    }

    @Test
    void printSecondMax() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Recursion.printSecondMax(list);

        assertEquals("40\n", outContent.toString());
    }

    @Test
    void printSecondMaxWithDuplicates() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(10);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Recursion.printSecondMax(list);

        assertEquals("10\n", outContent.toString());
    }
}
