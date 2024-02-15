package m35_java_lang_classes;

import java.util.Arrays;

public class Autoboxing_Unboxing_Practice {
    public static void main(String[] args) {

        Integer[] numbers = new Integer[5];   //Arrayler objedir!
        System.out.println(Arrays.toString(numbers));

        numbers[0] = 10;  //Autoboxing
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println(Arrays.toString(numbers));

        for (Integer number : numbers) {
            int value = number;   //Unboxing
            System.out.println(value);
        }

    }
}
