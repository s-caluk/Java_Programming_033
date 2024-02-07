package m32_arrays_part2;
import java.util.Arrays;
public class ReverseArrayElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        //System.out.println(reverseArray(numbers));         //[I@e9e54c2
        int[] result = reverseArray(numbers);
        System.out.println(Arrays.toString(result));         //[50, 40, 30, 20, 10]


        double[] arr1 = {1.5, 2.5, 3.5};
        double[] result2  = reverseArray(arr1);
        System.out.println(Arrays.toString(result2));        //[3.5, 2.5, 1.5]

        String[] names = {"Java", "Python", "C#", "Ruby"};
        String[] result3= reverseArray(names);
        System.out.println(Arrays.toString(result3));        //[Ruby, C#, Python, Java]

    }

    public static int[] reverseArray(int[] array){  //for-each ile yapilamaz

        if(array.length <= 1){
            return array;
        }

        int[] reversedArray = new int[array.length]; //{0, 0, 0, 0, 0}

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static double[] reverseArray(double[] array) {

        if(array.length <= 1){
            return array;
        }

        double[] reversedArray = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

    public static String[] reverseArray(String[] array) {

        if(array.length <= 1){
            return array;
        }

        String[] reversedArray = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }

        return reversedArray;
    }

}
