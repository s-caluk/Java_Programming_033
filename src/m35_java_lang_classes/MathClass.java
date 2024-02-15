package m35_java_lang_classes;

public class MathClass {
    public static void main(String[] args) {

        int num1 = Math.max(100, 200);
        System.out.println(num1);

        int num2 = Math.min(45, 25);
        System.out.println(num2);

        System.out.println( Math.abs(-100) );
        System.out.println( Math.abs(100) );

        double num3 = Math.pow(10, 4);
        System.out.println(num3);

        double num4 = Math.pow(5, 3);
        System.out.println(num4);           //125.0

        double num5 = Math.sqrt(100);
        System.out.println(num5);           //10.0

        int num6 = (int)Math.sqrt(9);
        System.out.println(num6);           //3

        System.out.println(Math.random());  //0.17655459018969255

        System.out.println(Math.round(10.7));  //11
        System.out.println(Math.round(10.3));  //10

        System.out.println(Math.floor(20.9));  //20.0

        System.out.println(Math.ceil(20.1)); //21.0

        System.out.println(Math.PI);  //3.141592653589793




    }
}
