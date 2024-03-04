package m46_error_exception_handling;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("Application Started");

        try {
            Thread.sleep(3000);      //3 sn bekletiyor
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Java Programming");


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Application Ended");


    }
}
