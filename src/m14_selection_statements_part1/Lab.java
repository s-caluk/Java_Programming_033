package m14_selection_statements_part1;

public class Lab {
    public static void main(String[] args) {

        //Write an if statement that assign 5 to x when y is equal to 20
        int x = 0;
        int y = 20;

        if (y == 20){
            x = 5;
        }
        System.out.println("x = " + x);

        /* Write an if statement that assigns 20 to the variable a if variable b is 50
        and c is greater and equal to 100
         */

        int a = 10;
        int b = 50;
        int c = 100;

        if( b == 50 && c >= 100){
            a = 20;
        }
        System.out.println("a = " + a);

         /* Write an if-else statement that assigns 20 to variable y if the variable x is greather than 100.
         Otherwise, it should assign 0 to the variable y.
          */
        int x1 = 110;
        int y1 = 50;

        if(x1 > 100){
            y1 = 20;
        }else{
            y1 = 0;
        }
        System.out.println("y1 = " + y1);

        /* Write an if-else statement that assign 0 to the variable b and assigns 1 to the variable c
        if the variable a is less than 10.
        Otherwise , it should assign -99 to the variable b and assign 0 to the variable c.
         */

        int a1 = 3;
        int b1 = 5;
        int c1 = 7;

        if( a1 < 10){
            b1 = 0;
            c1 = 1;
        }else{
            b1 = -99;
            c1 = 0;
        }
        System.out.println("b1 = " + b1);
        System.out.println("c1 = " + c1);

    }
}
