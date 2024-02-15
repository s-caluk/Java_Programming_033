package m35_java_lang_classes;

public class WrapperClass_Methods {
    public static void main(String[] args) {
        char ch = 'a';

        boolean isDigit = Character.isDigit(ch);
        System.out.println("isDigit " + isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println("isLetter " + isLetter);

        boolean isUpperCaseLetter = Character.isUpperCase(ch);
        System.out.println("isUpperCaseLetter " + isUpperCaseLetter);  //isUpperCaseLetter false

        boolean isLowerCaseLetter = Character.isLowerCase(ch);
        System.out.println("isLowerCaseLetter = " + isLowerCaseLetter); //isLowerCaseLetter = true

        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("isSpecialChar = " + isSpecialChar);  //isSpecialChar = false

        System.out.println("--------------------------------------");

        String str = "a1b2c3d4!@#$8765";

        for (char each : str.toCharArray()) {
            //System.out.println(each);

            if(Character.isDigit(each)){
                System.out.println(each);  //sadece rakamlari verir
            }
        }
        System.out.println("--------------------------------------");

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

    }
}
