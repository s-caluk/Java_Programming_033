package m27_string_class_part1;

public class EachCharacter {
    public static void main(String[] args) {

        eachCharacter("Cydeo");
        eachCharacter("");
    }

    public static void eachCharacter(String str) {

        if (str == null || str.length() == 0) {
            System.err.println("The text can not be null or empty");
            return; // exits the method
        }

        for (int i = 0; i < str.length(); i++) { // i: indexes of the str
            System.out.println(str.charAt(i));
        }

    }
}
