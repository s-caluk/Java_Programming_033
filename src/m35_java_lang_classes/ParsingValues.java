package m35_java_lang_classes;

public class ParsingValues {
    public static void main(String[] args) {

        String str = "20";
        int num = Integer.parseInt(str);

        Integer num1 =  Integer.valueOf(str);  //yeni obje olusturuyor

        Integer num2 = num ; //Autoboxing  num int´di.

        System.out.println(num);
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("---------------------------------------");

        String s = "20.5";
        System.out.println(s + 1);      //20.51

        double num3 = Double.parseDouble(s);
        System.out.println(num3 + 1);   //21.5

        double num4 = Double.valueOf(s);  //Unboxing, burda otomatik string double cevriliyor
        System.out.println(num4);         //20.5




    }
}
