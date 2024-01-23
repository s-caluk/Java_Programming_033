package m27_string_class_part1;

/**
 * 2 sekilde String Objesi olusturulur:
 * 1) String literal : deger ayni ise heap de bir yeri gösterir,string poole ekler, yani esittir.
 * 2) new keyword : deger/value ayni bile olsa heap de farkli alanlar acar.
 */
public class StringIntro {
    public static void main(String[] args) {
        String s1 = "Wooden Spoon";  //String literal
        String s2 = "Wooden Spoon";   //String literal

        System.out.println(s1 == s2);  // true

        String s3 = new String("Wooden Spoon"); //new Object
        String s4 = new String("Wooden Spoon");

        System.out.println(s3 == s4); //false
        System.out.println(s1 == s3); //false

    }
}
