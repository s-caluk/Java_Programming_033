package m26_user_input_scanner;
import java.util.Scanner;
public class MistakeNext {
    public static void main(String[] args) {
        Scanner scanMe = new Scanner(System.in);
        String firstName, lastName;

        System.out.println("Please write your first name?");
        firstName = scanMe.next();

        scanMe.nextLine(); // Enter

        System.out.println("Please write your last name?");
        lastName = scanMe.nextLine();

        scanMe.close();

        System.out.println(firstName + " " + lastName);

    }
}
