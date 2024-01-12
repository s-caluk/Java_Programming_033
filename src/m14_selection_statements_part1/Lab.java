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
    }
}
