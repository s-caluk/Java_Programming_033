package m46_error_exception_handling;

public class UncheckedException {
    public static void main(String[] args) {

        String str = "Java Programming";
        System.out.println(str.toUpperCase());

        //String str = null;            //nullpointer exception
        //System.out.println(10/0);     //ArithmeticException
        //System.out.println("java".charAt(100));  //StringIndexOutOfBoundsException

        String s = "abc";
        int num = Integer.parseInt(s);   //NumberFormatException
        System.out.println(num);

    }
}
