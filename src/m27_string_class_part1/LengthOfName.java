package m27_string_class_part1;

import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();

        input.close();

        int total = firstName.length() + lastName.length();
        System.out.println("Total character is: " + total);
    }
}
