package m11_operators_part1;

/**
 * Swapping Values with arithmetic operators
 */
public class SwapValues {
    public static void main(String[] args) {
        //By using Temporary Variable
        int num1 = 10;
        int num2 = 5;

        int temp;
        temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //without using Temporary Variable

        int sayi1 = 10;
        int sayi2 = 5;

        sayi2 = sayi2 + sayi1;
        sayi1 = sayi2 - sayi1;
        sayi2 = sayi2 - sayi1;

        System.out.println("sayi1 = "+ sayi1);
        System.out.println("sayi2 = "+ sayi2);


    }
}
