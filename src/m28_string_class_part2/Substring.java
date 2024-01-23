package m28_string_class_part2;

public class Substring {
    public static void main(String[] args) {

        String str = "Wooden Spoon";

        String firstWord = str.substring(0, str.indexOf(" ") );

        System.out.println("firstWord = " + firstWord);

        String secondWord = str.substring( str.indexOf(" ") + 1 );

        System.out.println("secondWord = " + secondWord);


        String r = str.substring(5, 11);
        System.out.println(r);


    }

}
