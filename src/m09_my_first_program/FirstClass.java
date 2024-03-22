package m09_my_first_program;

/**
 * This is an example of a documentation comment.
 */

public class FirstClass {
    public static void main(String[] args) {

        System.out.println("--------println & print----------");
        System.out.print("I love ");
        System.out.println("Java Programming");

        System.out.println("--------single-line & multi-line & documentation comments----------");
        // This is an example of a single-line comment.
        /*
        This is an example of a multi-line comment.
         */

        System.out.println("--------Common Escape Squences----------");
        System.out.println("\"");
        System.out.println("\\__/");
        System.out.println("He said:\"hello\".");
        System.out.println("Would you like \'coffe\' or \b\'tea\'");  //backspace
        System.out.println("Would you like \'coffe\' or \r\'tea\'");  //return
        System.out.println("*****\n\t*****\n\t\t*****\n\t\t\t*****\n\t\t\t\t*****");

        int x = 5;
        x = --x - x++ + ++x + x;  //4-4+6+6
        System.out.println(x);

    }
}
