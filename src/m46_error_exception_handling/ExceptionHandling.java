package m46_error_exception_handling;

import java.util.Arrays;

public class ExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Aplication started");

        String str = null;

        try {
            System.out.println(str.toLowerCase());  //NullPointerException
        } /*catch (NullPointerException e){
            System.out.println("Unexpected event: catch block executed --nullpointerex.");
        } catch (RuntimeException e) {
            System.out.println("Unexpected event: catch block executed --runtimeex. ");
        }*/
        catch (RuntimeException e){  //3 önemli method
            //System.out.println(e.getMessage()); //Cannot invoke "String.toLowerCase()" because "str" is null
            // e.printStackTrace();               //full hata mesajinin ciktisini veriyor
            System.out.println(Arrays.toString(e.getStackTrace())); //[ExceptionHandling.main(ExceptionHandling.java:12)]
        }
        finally {
            System.out.println("Optional Block: Finaly Block");
        }

        System.out.println("Aplication ended");

        System.out.println("--------------------------------------");

        try{
            System.out.println("Hello World");
            System.exit(0);
        }finally {
            System.out.println("Finally block");
        }

    }
}
