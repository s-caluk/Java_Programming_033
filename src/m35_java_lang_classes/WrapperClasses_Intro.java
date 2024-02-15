package m35_java_lang_classes;
// wrapper classda objeleri new ile degil , valueOf ile yapmalari tavsiye ediliyor.
public class WrapperClasses_Intro {
    public static void main(String[] args) {
        Integer num1 = Integer.valueOf(1234);
        System.out.println(num1 + 1);

        Integer num2 = Integer.valueOf("25");
        System.out.println(num2 + 1);

        Double num3 = Double.valueOf(2.5);
        System.out.println(num3);

        Double num4 = Double.valueOf(3.5);
        System.out.println(num4);

        Boolean bool1 = Boolean.valueOf(true);
        System.out.println(bool1);
    }
}
