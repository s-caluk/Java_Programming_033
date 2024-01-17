package m18_loops_part3;

public class DoWhileLoop {
    public static void main(String[] args) {
        int n =100;

        while(n < 0){ // false
            System.out.println("While Loop: Hello World");
        }

        System.out.println("----------------------------------");

        do{
            System.out.println("Do-While Loop: Hello World");
        }while(n < 0); // false

        System.out.println("----------------------------------");

        int i = 0;
        do{
            System.out.print(i + " ");
            i++;
        }while(i < 11);

    }
}
