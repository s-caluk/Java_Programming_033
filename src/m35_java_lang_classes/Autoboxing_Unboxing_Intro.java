package m35_java_lang_classes;

public class Autoboxing_Unboxing_Intro {
    public static void main(String[] args) {
        //Autoboxing-------------------------
        int a = 100;
        Integer num1 = a;

        long b = 200;
        // Integer num2 = b;
        Long num3 = b;

        byte c = 50;
        // Integer num4 = c;
        Byte num5 = c;

        //Unboxing--------------------------------
        Integer x = 100;
        int y = x;
        long z = x;

        Double m = 20.5;
        double n = m;
        //float f = m;



    }
}
