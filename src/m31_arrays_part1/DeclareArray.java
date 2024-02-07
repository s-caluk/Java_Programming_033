package m31_arrays_part1;


import java.util.Arrays;

public class DeclareArray {
    public static void main(String[] args) {

        int[] scores;
        scores = new int[4];

        scores[0] = 85;
        scores[1] = 70;
        scores[2] = 95;
        scores[3] = 90;

        //System.out.println(scores);
        System.out.println(Arrays.toString(scores));   //[85, 70, 95, 90]

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);
        System.out.println(scores[3]);
        // System.out.println(scores[4]); //ArrayIndexOutOfBoundsException

        System.out.println("------------------------------------------------");

        String[] names = {"Java", "Python", "C#", "Ruby", "C++"};

        System.out.println( Arrays.toString(names));

        int[] numbers;
        // numbers = {10, 20, 30, 40};

    }
}
