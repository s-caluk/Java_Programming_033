package m46_error_exception_handling;

import java.io.FileNotFoundException;

public class ThrowsKeyword {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Aplication started");

        Thread.sleep(3000);

        System.out.println("Java Programming");

        Thread.sleep(3000);

        System.out.println("Aplication ended");
    }

    public static void methodA() throws FileNotFoundException{
        throw new FileNotFoundException();
    }

    public static void methodB(){
        //   methodA();
    }

    public static void methodD(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public static void methodE(){
        methodD();
    }
}
