package m27_string_class_part1;

public class EqualsMethodVsEqualsOparator {
    public static void main(String[] args) {

        String str1 = "Java",
                str2 = "Java";

        System.out.println(str1 == str2);      //t same object?
        System.out.println(str1.equals(str2)); //t have the same characters in the same order?

        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4);      //false; same object?
        System.out.println(str3.equals(str4)); //t

        System.out.println(str1.equals(str3)); //t

        String str5 = "java";

        System.out.println(str1.equals(str5)); //false

    }
}
