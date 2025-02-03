import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.io.File;

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

        Java.RecursionFifth.printEvenValues(list);

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

        Java.RecursionSixth.printEvenIndexes(list);

        assertEquals("10\n20\n30\n", outContent.toString());
    }

    @Test
    void printSecondMax() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(50);
        list.add(40);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Java.RecursionSeventh.printSecondMax(list);

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

        Java.RecursionSeventh.printSecondMax(list);

        assertEquals("20\n", outContent.toString());
    }
    @Test
    void printSecondMaxWithMaxInStart() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(19);
        list.add(20);
        list.add(10);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Java.RecursionSeventh.printSecondMax(list);

        assertEquals("20\n", outContent.toString());
    }
    @Test
    void recursionSearch() {
        String filePath = "/home/mathematist/BobrovskiyEd/IsPalindrome.cs";
        String file = "IsPalindrome.cs";
        File fileFiled = new File(filePath);
        File path = new File("/home/mathematist/");
        Java.RecusrionEighth.recursionSearch(path, file);
        assertEquals(fileFiled, Java.RecusrionEighth.recursionSearch(path, file).get(1));
    }
}
