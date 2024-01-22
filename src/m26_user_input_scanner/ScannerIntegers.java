package m26_user_input_scanner;

import java.util.Scanner;

public class ScannerIntegers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number.");
        byte firstNum = input.nextByte();

        System.out.println("Enter your second number.");
        short secondNum = input.nextShort();

        System.out.println("Enter your third number.");
        int thirdNum = input.nextInt();

        System.out.println("firstNum = " + firstNum);
        System.out.println("secondNum = " + secondNum);
        System.out.println("thirdNum = " + thirdNum);
    }
}
