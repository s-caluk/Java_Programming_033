package m16_loops_part1;

public class DifferentStartEnd {
    public static void main(String[] args) {
        /*
        Print the numbers which starts from 5 and ends at 20 (inclusive) in the same line with a space between the numbers.

        Print the numbers which starts from 20 and ends at 10 (exclusive).

        Print the numbers which starts from 10 and ends at 100 (inclusive) with an increment of 10.

        Print the numbers which starts from 50 and ends at 10 (exclusive) with and decrement of 4.

        Print "Hello" five times.
         */

        for (int i = 5; i <= 20; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 20; i > 10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 10; i <= 100; i += 10) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 50; i > 10; i -= 4) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("--------------------------------");

        for (int i = 5; i < 10; i++) {
            System.out.println("Hello");
        }

    }
}
