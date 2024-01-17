package m17_loops_part2;

public class Lab1 {
    public static void main(String[] args) {
        //write a program that prints the multiplication table

        for (int i = 1; i <=9; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.print(i + "*" + j + "=" + (i*j));
                System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println("---------------------------------");

        //square pattern
        int givenNum = 6;
        for (int i = 0; i < givenNum ; i++) {
            for (int j = 1; j < givenNum ; j++) {
                System.out.print("*  ");

            }
            System.out.println();
        }

        System.out.println("----------------------------------");
        for (int i = 1; i < 6 ; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(" ");

            }
            System.out.println("#");
        }
    }
}
