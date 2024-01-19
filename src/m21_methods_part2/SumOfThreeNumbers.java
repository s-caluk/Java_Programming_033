package m21_methods_part2;

public class SumOfThreeNumbers {
    public static void main(String[] args) {

        sumOf3Numbers(10, 20, 30);

        int a = 10;
        byte b = 20;
        short c = 30;

        sumOf3Numbers(a, b, c);

        int x = 100;
        long y = 200;
        long z = 300;

        sumOf3Numbers(x, (int) y, (int) z);
    }

    public static void sumOf3Numbers(int num1, int num2, int  num3){
        System.out.println("Sum: " + (num1+num2+num3) );
    }
}
