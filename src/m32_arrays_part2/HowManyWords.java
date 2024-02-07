package m32_arrays_part2;

import java.util.Arrays;

public class HowManyWords {

    public static void main(String[] args) {

        String str = "In computer programming, white space refers to any character or sequence of characters that " +
                "represent empty space or have no visible representation when rendered.";

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);                //24

        System.out.println("--------------------------------------");

        char[] arr = str.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);                   //162
        System.out.println(str.length());                 //162
        System.out.println(arr.length == str.length());   //true


    }
}
