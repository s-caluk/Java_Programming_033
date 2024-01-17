package m16_loops_part1;

public class Lab4 {
    public static void main(String[] args) {
        //Fibonacci series number , examble input 9 , output: 0 1 1 2 3 5 8 13 21 , 3.kova!

        int num1 = 0;
        int num2 = 1;
        int sum = 0;   //3.kova

        for (int i = 1; i <= 9; i++) {

            System.out.print(num1 + " ");

            //compute the next numbers in the series
            sum = num1 + num2 ;
            num1 = num2;
            num2 = sum;

            //System.out.print(sum + " ");
        }

    }
}
