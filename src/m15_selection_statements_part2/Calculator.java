package m15_selection_statements_part2;

public class Calculator {
    public static void main(String[] args) {

        double num1 = 300, num2 = 25;

        char operator = '/';

        switch(operator) {
            case '+':
                System.out.println("Addition: " + (num1 + num2));
                break;

            case '-':
                System.out.println("Substraction: " + (num1 - num2));
                break;

            case '*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;

            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;

            default:
                System.out.println("Invalid Operator");

        }
    }
}
