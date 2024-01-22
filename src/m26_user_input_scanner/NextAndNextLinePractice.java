package m26_user_input_scanner;

import java.util.Scanner;

public class NextAndNextLinePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // Enter

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("age: " + age);
        System.out.println("fullName: " + fullName);
    }
}
